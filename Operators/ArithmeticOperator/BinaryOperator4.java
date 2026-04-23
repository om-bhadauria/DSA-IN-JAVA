/* Binary Arithmetic Operators(2 operands)
iv)Division Operator(/) :
->They uses two operands and perform division operation on them.
->The result of the divisionoperator is the quotient of the two operands. 
->The division operator is represented by the symbol "/". 

For example; if we have two operands a and b, then the expression a / b will return the quotient of a divided by b.

NOTE:
->It is important to note that when using the division operator, if the second operand (the divisor) is zero, it will 
result in an error called "division by zero". Therefore, it is important to ensure that the divisor is not zero before
performing a division operation.  
 */


//USING SCANNER CLASS TO TAKE INPUT FROM USER
package Operators.ArithmeticOperator;

import java.util.*;
public class BinaryOperator4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b= sc.nextInt();
        int div = a/b;
        System.out.println("the division of two number :" +div);
        sc.close();
    }
}

/*USING DIRECTLY

package Operators.ArithmeticOperator;
public class BinaryOperator4{
public static void main (String args[]){
    int a=22;
    int b=2;
    int div = a/b;
    System.out.println("the division of two number :" +div);
    }
}*/