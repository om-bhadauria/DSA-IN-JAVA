/*Function overloadinf using datatypes 

function 1 : Add 2 int value : int sum (int a, int b){
                                return a+b ;
                            }


function 2 : Add 2 float value : float sum (float a, float b){
                                return a+b ;
                             }
*/


public class k_Function_Overloading_Using_DataType {
     
    //function to calculate int sum 
    public static int sum(int a, int b){
        return a+b;
    }

    //function to calculate float sum
    public static float sum(float a , float b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(sum(2, 3));
        System.out.println(sum(2.5f, 2.5f));
    }
    
}
