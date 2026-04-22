/* Binary Arithmetic Operators(2 operands)
i)Multiplication Operator(*)   
 */

// USING SCANNER CLASS TO TAKE INPUT FROM THE USER
package Operators.ArithmeticOperator;
import java.util.*;
public class BinaryOperator3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int mul = a*b;
        System.out.println("the multiplication of two number :" +mul);
        sc.close();
    }
}

// USING DIRECTLY
/*
package Operators.ArithmeticOperator;
public class Operator4{
public class static void main(string[] args){
    int a=10;
    int b=20;
    int mul = a*b;
    System.out.println("the multiplication of two number :" +mul);
    }
}
*/