/*
subarray = a continuous part of array 
for eg) 2,4,6 -> subarray ; 2,4,8 -> not subarray
-----------     ---  -----  ------- --------- ------------
2|4|6|8|10|  -> |2|  |2|4|  |2|4|6| |2|4|6|8| |2|4|6|8|10|     -> SUBARRAYS OF 2
-----------     ---  -----  ------- --------- ------------
                ---  -----  ------- --------- 
             -> |4|  |4|6|  |4|6|8| |4|6|8|10|                 -> SUBARRAYS OF 4
                ---  -----  ------- --------- 
                ---  -----  ------- 
             -> |6|  |6|8|  |6|8|10|                           -> SUBARRAYS OF 6
                ---  -----  ------- 
                ---  -----  
             -> |8|  |8|10|  |                                 -> SUBARRAYS OF 8
                ---  ----- 
                --- 
             -> |10|                                           -> SUBARRAYS OF 10
                --- 
FORMULA TO FIND SUBARRAYS : N(N+1)/2
*/

public class I_Print_Subarray {
    public static void subarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=1; j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){             //print
                    System.out.print(numbers[k] + " ");  //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
         System.out.println("total subarray :" +ts);
    }

    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10};
        subarrays(numbers);
    }
    
}
