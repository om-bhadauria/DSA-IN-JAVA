/*LOGICAL OR OPERATOR(||) */

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

//METHOD-NUMBER-1

/*package Operators.LogicalOperator;
import java.util.*;
public class Operator2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first boolean result(true/false):");
        boolean result1= sc.nextBoolean();
        System.out.println("enter the second boolean result:(true/false):");
        boolean result2 =sc.nextBoolean ();
        boolean finalresult = result1||result2;
        System.out.println("the result of logical OR operation is:" + finalresult);
        sc.close();
    }
}
*/

//METHOD-NUMBER-2

package Operators.LogicalOperator;
import java.util.*;
public class Operator2{

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
        
        //first comparison
        System.out.println("enter the first number :");
        int a = sc.nextInt();

        System.out.println("enter the second number :");
        int b = sc.nextInt();

        System.out.println("enter the relational operator for (a,b):");
        String op1 = sc.next();
        boolean result1 = evaluate(a, b, op1);

        //second comparison
        System.out.println("enter the third number :");
        int c = sc.nextInt();

        System.out.println("enter the fourth number :");
        int d = sc.nextInt();
        
        System.out.println("enter the relational operator for (c,d):");
        String op2 = sc.next();
        boolean result2 = evaluate(c, d, op2);

        boolean finalresult = result1 || result2;

        System.out.println("Result of first condition: " + result1);
        System.out.println("Result of second condition: " + result2);
        System.out.println("the result of logical OR operation is:" + finalresult);
        sc.close();
    }

}

/*USING DIRECTLY
package Operators.LogicalOperator;
public class Operator2{
    public static void main(String[] args){
        boolean result1 = true;
        boolean result2 = false;
        boolean finalresult = result1 || result2;
        System.out.println("the result of logical OR operation is:" + finalresult);
    }
 }  
*/