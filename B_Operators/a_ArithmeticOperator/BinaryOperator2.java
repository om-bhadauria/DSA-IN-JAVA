/*Binary Arithmetic Operators(2 operands)
ii)Subtraction Operator(-) 
*/
  

// USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package B_Operators.a_ArithmeticOperator;
import java.util.Scanner;
public class BinaryOperator2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number:"); 
    int a= sc.nextInt();
    System.out.println("enter the second number:");
    int b = sc.nextInt();
    int sub = a-b;
    System.out.println("the subtraction of two number :"+sub);
    sc.close();
}
}

/* USING DIRECTLY

package Operators.ArithmeticOperator;
public class Operator3 {
    public static void main (String[] args){
    int a=10;
    int b=20;
    int sub = a-b;
    System.out.println("the subtraction of two number :"+sub);
    }
    
}
 */
