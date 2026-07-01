/* INSERTION SORT :
--> Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
--> The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and 
    placed at the correct position in the sorted part.

INSPIRATION : Through an experiment of playing cards , we can see that the cards are sorted in our hands. 
              Similarly, in insertion sort, the elements are sorted in the array by placing them at the correct 
              position.

For example: {5,4,1,3,2} --> unsorted array --> n=5

5,4,1,,3,2
4,5,1,3,2
1,4,5,3,2
1,3,4,5,2
1,2,3,4,5
0th term : {4,5,1,3,2} --> 5 is the largest element and it is placed at the end of the array.
1st term : {1,4,5,3,2} --> 4 is the second largest element and it is placed at the second last position of the array.
2nd term : {1,3,4,5,2} --> 3 is the third largest element and it is placed at the third last position of the array.
3rd term : {1,2,3,4,5} --> 2 is the fourth largest element and it is placed at the fourth last position of the array.

Time complexity : O(n^2) --> worst case
*/
package J_Basic_Sorting_Algorithm;
public class D_Insertion_Sort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];                                      //curr = current element 
            int prev = i-1;                                         //prev = previous element  
            //finding out the correct position to insert         
            while(prev >= 0 && arr[prev] > curr){                   //for decreasing order = change > to <
                arr[prev+1] = arr[prev];                            //shift
                prev--;
            }                     
            //Insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArray(arr);
    }
}
