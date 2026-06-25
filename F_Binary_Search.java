/*

PREREQUESITES:SORTED ARRAY
BINARY SEARCH : FIND THE INDEX OF ELEMENT IN A GIVEN SORTED ARRAY.

->BINARY SEARCH IS A SEARCHING ALGORITHM USED TO FIND THE POSITION OF A TARGET VALUE WITHIN A SORTED ARRAY. 
->IT WORKS BY COMPARING THE TARGET VALUE TO THE MIDDLE ELEMENT OF THE ARRAY; 
->IF THEY ARE NOT EQUAL, THE HALF IN WHICH THE TARGET CANNOT LIE IS ELIMINATED AND THE SEARCH CONTINUES ON THE REMAINING HALF UNTIL IT IS SUCCESSFUL.

TIME COMPLEXITY OF BINARY SEARCH IS O(log n) : n IS THE SIZE OF ARRAY
EXAMPLE:

KEY=10
------------------
|2|4|6|8|10|12|14|
------------------

PSEUDO CODE:

(1)Start = 0 and End = n-1
(2)while(Start <= End)
(3)find mid : mid = (Start + End)/2
(4)Compare mid & key
   mid==key : return mid   ; FOUND
   mid>key : End = mid-1   ; LEFT  ; END UPDATED 
   mid<key : Start = mid+1 ; RIGHT ; START UPDATED
 */
public class F_Binary_Search{
    
    public static int binary_search(int numbers[],int key){
        int start =0 , end=numbers.length-1;

        while(start<=end){
            int mid =(start+end)/2;

            //comparision
            if(numbers[mid]==key){
                return mid;
            } else if(numbers[mid]>key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10,12,14,16};
        int key =10;

        System.out.println("key found at index :" + binary_search(numbers,key));
    }
}