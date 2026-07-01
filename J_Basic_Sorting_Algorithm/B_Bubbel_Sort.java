/* BUBBLE SORT 
--> large element come to the end of an array by swapping with adjacent elements.
-->Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they
   are in the wrong order. 

INSPIRATION : Through an experiment of boiling water , we can see that the bubbles of water are coming to the 
              surface of water. Similarly, in bubble sort, the largest element comes to the end of an array by
              swapping with adjacent elements.

{5,4,1,3,2} --> unsorted array
{1,2,3,4,5} --> increasing order --> sorted array
{5,4,3,2,1} --> decreasing order --> sorted array

for example : {5,4,1,3,2} --> unsorted array --> n=5

5,4,1,3,2 
4,5,1,3,2
4,1,5,3,2
4,1,3,5,2
4,1,3,2,5

0th term : {4,1,3,2,5} --> 5 is the largest element and it is placed at the end of the array.

4,1,3,2,5
1,4,3,2,5
1,3,4,2,5
1,3,2,4,5

1st term : {1,3,2,4,5} --> 4 is the second largest element and it is placed at the second last position of the array.

1,3,2,4,5
1,3,2,4,5
1,2,3,4,5

2nd term : {1,2,3,4,5} --> 3 is the third largest element and it is placed at the third last position of the array.

1,2,3,4,5

3rd term : {1,2,3,4,5} --> 2 is the fourth largest element and it is placed at the fourth last position of the array.

total terms = n-1 = 5-1 = 4
0th term :  0 to (n-2)
1st term :  0 to (n-3)
2nd term :  0 to (n-4)
3rd term :  0 to (n-5)

upper layer : for (int i =0; i<n-1;i++){
inner layer :        for(int j =0; j<n-2-i;j++){
                    }
                }

Time complexity : O(n^2) --> worst case
*/
package J_Basic_Sorting_Algorithm;

public class B_Bubbel_Sort {
    public static void bubblesort(int arr[]){
        for (int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn ;j++){
                if(arr[j] > arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }   
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printArray(arr);
    }
    
}
