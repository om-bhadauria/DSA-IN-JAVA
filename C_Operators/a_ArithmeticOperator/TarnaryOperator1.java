//if student pass or fails : if number is greater than 33 then they pass if number is not greater than 33 then they fail.

package C_Operators.a_ArithmeticOperator;
import java.util.*;
public class TarnaryOperator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of student : ");
        int marks =sc.nextInt();

        String num = (marks>=33)? "pass" :"fail";
        System.out.println("the result is "+ num);
        sc.close();
    }
    
}
