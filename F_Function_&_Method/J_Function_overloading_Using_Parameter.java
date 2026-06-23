/*Function overloading using parameter 

function 1 : Sum of 2 number : int sum (int a , int b){
                                return a+b ;
                               }

function 2 : Sum of 3 number : int sum (int a , int b, int c){
                                return a+b+c ;
                               }
*/

public class J_Function_overloading_Using_Parameter {
    
    //function to calculate sum of 2 number 
    public static int sum(int a, int b){
        return a+b ;
    }

    //function to calculate sum of 3 number 
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,5));
        System.out.println(sum(5, 5, 5));
    }
}
