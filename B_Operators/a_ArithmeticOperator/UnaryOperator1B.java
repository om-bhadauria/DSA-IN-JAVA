/*Unary Arithmetic Operator
i) Increment Operator(++) :
-> It is used to increase the value of a variable by 1.
-> It is represented by the symbol '++'.
*/

                              // POST INCREMENT
 
//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package C_Operators.a_ArithmeticOperator;
import java.util.*;
public class UnaryOperator1B{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        int b = a++;                // post increment
        System.out.println("now the value of a is :" + a);                                 
        System.out.println("the result is :" + b);
        sc.close();
    }
}

/*USING DIRECTLY
package Operators.ArithmeticOperator;
public class UnaryOperator1B{
    public static void main (String[] args){
        int a = 10;
        int b = a++;                // post increment
        System.out.println("the result is :" + b);
    }
 }  
*/