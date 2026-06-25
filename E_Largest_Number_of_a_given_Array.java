/*
FIND THE LARGEST NUMBER OF A GIVEN ARRAY
-----------
|1|2|6|3|5|
-----------

notes: 
-infity =integer.MIN_VALUE
+infity =integer.MAX_VALUE
*/
public class E_Largest_Number_of_a_given_Array {
    
    public static int Largest(int Lar_number[] , int Sma_number[]){
        int largest = Integer.MIN_VALUE; //infity = integer.MIN_VALUE
        int smallest = Integer.MAX_VALUE; //infity = integer.MAX_VALUE
        for(int i=0;i<Lar_number.length;i++){
            if(largest<Lar_number[i]){
                largest = Lar_number[i];
            }
            if(smallest>Sma_number[i]){
                smallest = Sma_number[i];
            }
        }

        System.out.println("Smallest value is :"+smallest);
        return largest;
    }

    public static void main(String args[]){
        int Lar_number[]={1,2,6,3,5};
        int Sma_number[]={1,2,6,3,5};
        System.out.println("Largest number is :" +Largest(Lar_number, Sma_number));
       
    }

}
