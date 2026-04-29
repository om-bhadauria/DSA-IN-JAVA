/*Binary Arithmetic Operators(2 operands)
i)Addition Operator(+) 
*/
  

// USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package B_Operators.a_ArithmeticOperator;
import java.util.*;
public class BinaryOperator1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a= sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of the two number :" + sum);
        sc.close();
    }
    
}

/*USING DIRECTLY 

package Operators.ArithmeticOperator;
public class Operator2 {
    public static void main (String[] args){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("the sum of the two number :" + sum);
    }
    
}

*/
