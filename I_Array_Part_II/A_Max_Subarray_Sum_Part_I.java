/*
MAX SUBARRAY SUM?
(1,-2,6,-1,3): 
SUBARRAY 1 : (1)            ; SUM = 1
SUBARRAY 2 : (1,-2)         ; SUM = -1
SUBARRAY 3 : (1,-2,6)       ; SUM = 5
SUBARRAY 4 : (1,-2,6,-1)    ; SUM = 4
SUBARRAY 5 : (1,-2,6,-1,3)  ; SUM = 7

3 nested loops used where Time Complexity = O(N^3)->VERY BAD ;ONE GOOD APPROACH KNOWN AS PREFIX SUM APPROACH 
*/
package I_Array_Part_II;

public class A_Max_Subarray_Sum_Part_I {
    public static void MaxSubarraysSum(int numbers[]){

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
                currsum=0;
                for(int k=start;k<=end;k++){             
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }   
            }
        }
        System.out.println("max sum :" + maxsum);
         
    }

    public static void main(String args[]){
        int numbers[] ={1,-2,6,-1,3};
        MaxSubarraysSum(numbers);
    }
    
    
}
