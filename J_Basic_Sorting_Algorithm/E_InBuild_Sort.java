/* IN-BUILD SORTING ALGORITHM
 --> Java provides built-in sorting methods that can be used to sort arrays and collections.
 --> The most commonly used built-in sorting methods are Arrays.sort() and Collections.sort().
 
 1. Arrays.sort() : This method is used to sort arrays in ascending order. It uses a dual-pivot quicksort algorithm
                     for primitive types and a modified mergesort algorithm for objects.

 2. Collections.sort() : This method is used to sort collections (like lists) in ascending order. It uses a modified
                           mergesort algorithm.

In-Build Sort: 

(1) ARRAYS.SORT() :

import java.util.Arrays; 
Arrays.sort(arr);                                // Sorts the array in ascending order
Arrays.sort(arr,starting index , ending index);  // Sorts the array from starting index to ending index in ascending order

(2) COLLECTIONS.SORT() :

import java.util.Collections;
Arrays.sort(arr, Collections.reverseOrder());                                 // Sorts the array in descending order
Arrays.sort(arr, starting index , ending index, Collections.reverseOrder());  // Sorts the array from starting index to ending index in descending order


Time complexity : O(n log n) <<<<<  O(n^2)
*/
package J_Basic_Sorting_Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class E_InBuild_Sort {
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*  public static int compare(int a , int b){
         //a < b : -1(Negative value)
         //a = b : 0 (Zero)
         //a > b : 1 (Positive value)
         retrun b-a;  // for decreasing order
     } 
    */

    public static void main(String args[]){
       // int arr[] = {5,4,1,3,2};
       // Arrays.sort(arr);                   // Sorts the array in ascending order
       // Arrays.sort(arr,0,3);                // Sorts the array from starting index to ending index in ascending order
       Integer arr[] = {5,4,1,3,2};
       // Arrays.sort(arr, Collections.reverseOrder());                                 // Sorts the array in descending order 
       Arrays.sort(arr, 0,3, Collections.reverseOrder());  // Sorts the array from starting index to ending index in descending order
       printArray(arr);
    }
}
