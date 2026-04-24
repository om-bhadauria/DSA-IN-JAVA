/*LOGICAL AND:
-> The logical AND operator (&&) returns true if both operands are true; otherwise, it returns false. 
*/

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

/*METHOD-NUMBER-1*/

package Operators.LogicalOperator;
import java.util.*;
public class Operator1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first boolean value (true/false):");
        boolean val1=sc.nextBoolean();
        System.out.println("Enter the second boolean value (true/false):");
        boolean val2=sc.nextBoolean();
        boolean result=val1&&val2;
        System.out.println("The result of the logical AND operation is: "+result);
        sc.close();
    }
}

/*METHOD-NUMBER-2*/

package Operators.LogicalOperator;

import java.util.Scanner;

public class Operator1 {

    // method to evaluate relational operator
    public static boolean evaluate(int x, int y, String op) {
        switch (op) {
            case ">":  return x > y;
            case "<":  return x < y;
            case ">=": return x >= y;
            case "<=": return x <= y;
            case "==": return x == y;
            case "!=": return x != y;
            default:
                System.out.println("Invalid relational operator!");
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First comparison (a, b)
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter relational operator for (a, b): ");
        String op1 = sc.next();

        boolean result1 = evaluate(a, b, op1);

        // Second comparison (c, d)
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter value of d: ");
        int d = sc.nextInt();

        System.out.print("Enter relational operator for (c, d): ");
        String op2 = sc.next();

        boolean result2 = evaluate(c, d, op2);

        
        boolean finalResult = result1 && result2 ;

        System.out.println("Result of first condition: " + result1);
        System.out.println("Result of second condition: " + result2);
        System.out.println("Final result: " + finalResult);
    }
}

/*USING DIRECTLY
package Operators.LogicalOperator;
public class Operator1{
    public static void main(String[] args){
        boolean val1 = true;
        boolean val2 = false;
        boolean result = val1 && val2;
        System.out.println("The result of the logical AND operation is: " + result);
    }
}