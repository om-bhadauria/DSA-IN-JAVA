/*                    PREFIX SUM

MAX SUBARRAY SUM?    
ARRAY : (1,-2,6,-1,3) ; 
PREFIX ARRAY : (SUM OF INDEX 0 , SUM OOF INDEX 1,.........+SUM OF INDEX N)
             : (1,-1,5,4,7)

SUBARRAY 1 : (1)            ; SUM OF INDEX 0 = 1
SUBARRAY 2 : (1,-2)         ; SUM OF INDEX 1 = -1
SUBARRAY 3 : (1,-2,6)       ; SUM OF INDEX 2 = 5
SUBARRAY 4 : (1,-2,6,-1)    ; SUM OF INDEX 3 = 4
SUBARRAY 5 : (1,-2,6,-1,3)  ; SUM OF INDEX 4 = 7

PREFIX[END] -PREFIX[START-1]
TIME COMPLEXITY WITH PREFIX ARRAY : O(N^2) < O(N^3)
*/
package I_Array_Part_II;

public class B_Max_Subarray_Sum_Part_II {

    public static void MaxSubarraySum(int numbers[]){

        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] =numbers[0];
        //calculate prefix array
        for(int i=1 ; i<prefix.length ;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        
        for(int i=1 ; i<numbers.length ; i++){
            int start = i;
            for(int j=i; j<numbers.length ;j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currsum){
                    maxsum =currsum;
                }
            }
        }
        System.out.println("maxsum : " + maxsum);
    }

    public static void main(String args[]){
        int numbers[] ={1,-2,6,-1,3};
        MaxSubarraySum(numbers);
    }
    
}
