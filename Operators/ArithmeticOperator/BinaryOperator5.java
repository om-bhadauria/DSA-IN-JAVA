/*Binary Arithmetic Operator
v) Modulus Operator(%) :
-> It is used to find the remainder after division of one number by another.
-> It is represented by the symbol '%'. 
 */

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER
package Operators.ArithmeticOperator;
import java.util.*;
public class BinaryOperator5{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int remainder = a % b;
        System.out.println("the remainder is :" + remainder);
        sc.close();
    }}

/*USING DIRECTLY
package Operators.ArithmeticOperator;
public class BinaryOperator5{
    public static void maiin (String args[]){
    int a = 5;
    int b= 2;
    int remainder = a%b;
    System.out.println("the remainder is:" + remainder);
    }
}
 */