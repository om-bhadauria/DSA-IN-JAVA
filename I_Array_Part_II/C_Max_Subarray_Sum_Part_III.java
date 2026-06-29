/*                kadane's algorithm 

BIG POSITIVE NUMBER + SMALL POSITIVE NUMBER = +VE NUMBER (FAVORABLE SITUATION)
BIG POSITIVE NUMBER + SMALL NEGATIVE NUMBER = +VE NUMBER (FAVORABLE SITUATION)
SMALL POSITIVE NUMBER + BIG NEGATIVE NUMBER = -VE NUMBER (NOT FAVORABLE SITUATION) MAKE IT ZERO(0)

KADANE'S ALGORITHM = Define as one by one going to element then find the current sum and max sum.

ARRAY      : (-2,-3,4,-1,-2,1,5,-3) ; 
CURRENT SUM: (0,0,4,3,1,2,7,4)                            //STARTING =ZERO(0)
MAXIMUM SUM: (0,0,4,4,4,4,7,7)                            //STARTING =NEGATIVE INFITY 

SUBARRAY 1 : (1)            ; SUM OF INDEX 0 = 1
SUBARRAY 2 : (1,-2)         ; SUM OF INDEX 1 = -1
SUBARRAY 3 : (1,-2,6)       ; SUM OF INDEX 2 = 5
SUBARRAY 4 : (1,-2,6,-1)    ; SUM OF INDEX 3 = 4
SUBARRAY 5 : (1,-2,6,-1,3)  ; SUM OF INDEX 4 = 7

TIME COMPLEXITY WITH PREFIX ARRAY : O(N) < O(N^2) < O(N^3)
*/

package I_Array_Part_II;
public class C_Max_Subarray_Sum_Part_III{
    
    public static void kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=1 ; i<numbers.length ;i++){
            cs = cs + numbers[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our maxarray sum is :" + ms);
    }

    public static void main(String[] args) {
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}