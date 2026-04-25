//LOGICAL NOT OPERATOR(!)

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

//METHOD-NUMBER-1

/*
package Operators.LogicalOperator;
import java.util.*;
public class Operator3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the boolean value(true/false):");
        boolean val = sc.nextBoolean();
        boolean result = !val;
        System.out.println("the result of logical NOT operation is:" + result);
        sc.close();
    }
}
*/

//METHOD-NUMBER-2

package C_Operators.LogicalOperator;
import java.util.*;
public class Operator3{

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

    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the first number :");
        int a = sc.nextInt();

        System.out.println("enter the second number :");
        int b = sc.nextInt();

        System.out.println("enter the relational operator for (a,b):");
        String op1 = sc.next();
        boolean result1 = evaluate(a, b, op1);

        System.out.println("the result of the statement is:" + result1);

        boolean finalresult = !result1;
        System.out.println("the result of logical NOT operation is:" + finalresult);    
        sc.close();
    }
}
