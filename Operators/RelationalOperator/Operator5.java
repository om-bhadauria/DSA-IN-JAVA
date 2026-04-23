/*Relational Operators in Java: 
v)Greater than or equal to (>=) :
-> This operator checks if the value of the left operand is greater than or equal to the value of the right operand.
-> If it is, it returns true; otherwise, it returns false. 
*/

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package Operators.RelationalOperator;
import java.util.*;
public class Operator5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b = sc.nextInt();
        System.out.println("the result is :" + (a>=b));
        sc.close(); 

        //SECOND METHOD:
        //boolean result =(a>=b);
        //System.out.println("the result is :" + result);
    }
}

/*USING DIRECTLY
package Operators.RelationalOperator;
    public class Operator5 {
        public static void main(String[] args){
            int a = 10;
            int b = 20;
            System.out.println("the result is :" + (a>=b));
        }
    }
 */
