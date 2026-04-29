/*Unary Arithmetic Operator
i) Increment Operator(++) :
-> It is used to increase the value of a variable by 1.
-> It is represented by the symbol '++'.
*/

                              // PRE INCREMENT
 
//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package C_Operators.a_ArithmeticOperator;
import java.util.*;
public class UnaryOperator1A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a= sc.nextInt();
        int b= ++a; 
        System.out.println("now the value of a is :" + a);                                 // pre increment
        System.out.println("the result is :" + b);
        sc.close();
    }
}

/*USING DIRECTLY
package Operators.ArithmeticOperator;
public class UnaryOperator1A{
    public static void main(String[] args){
        int a = 5;
        int b = ++a;                               // pre increment
        System.out.println("the result is :" + b);
    }
 }
*/