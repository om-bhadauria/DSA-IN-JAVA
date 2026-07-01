/* SELECTION SORT 
--> Pick an element (from unsorted array) & place it at the right position in the sorted array
--> pick the smallest (from unsorted array) , put it at the beginning of the array and repeat the process for the remaining elements.
--> Find the minimum element in the array and swap it with the first element.
--> Repeat the process for the remaining elements.

INSPIRATION : Through an experiment of boiling water , we can see that the bubbles of water are coming to the 
              surface of water. Similarly, in selection sort, the smallest element comes to the beginning of an 
              array by swapping with adjacent elements.

For example : {5,4,1,3,2} --> unsorted array --> n=5

5,4,1,3,2
1,|5,4,,3,2| --> after 1st iteration
1,2,|5,4,3|  --> after 2nd iteration
1,2,3,|5,4|  --> after 3rd iteration
1,2,3,4,|5|  --> after 4th iteration

0th term : {1,5,4,3,2} --> 1 is the smallest element and it is placed at the beginning of the array.
1st term : {1,2,5,4,3} --> 2 is the second smallest element and it is placed at the second position of the array.
2nd term : {1,2,3,5,4} --> 3 is the third smallest element and it is placed at the third position of the array.
3rd term : {1,2,3,4,5} --> 4 is the fourth smallest element and it is placed at the fourth position of the array.
total terms = n-1 = 5-1 = 4 
Outer loop : for (int i =0; i<n-2 ;i++){            create a smallest  = MAX_VALUE
Inner loop : for (int j =i+1; j<n ;j++){
                    }
                }
Time complexity : o(n^2) --> worst caseo    
*/
package J_Basic_Sorting_Algorithm;

public class C_Selection_Sort {

    public static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1; i++){                  //arr.length = n
            int minPos = i;                                  //mimPos = MINIMUM POSTION = i 
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[minPos] > arr[j]){                   // for decreasing order = change > to <
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] ={5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
    
}
