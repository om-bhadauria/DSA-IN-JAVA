/*Unary Arithmetic Operator
ii) Decrement Operator(--) :
-> It is used to decrease the value of a variable by 1.
-> It is represented by the symbol '--'.
 */

                              // POST DECREMENT  
                        
//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package C_Operators.ArithmeticOperator;
import java.util.*;
public class UnaryOperator2B{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a= sc.nextInt();
        int b = a--;                // post decrement
        System.out.println("now the value of a is :" + a);
        System.out.println("the result is :" + b);
        sc.close();
    }
}