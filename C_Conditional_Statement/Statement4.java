//QUESTION-NUMBER-4: PRINT THE LARGEST OF THREE NUMBERS USING ELSE-IF STATEMENT.
package C_Conditional_Statement;
import java.util.*;
public class Statement4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int num2=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER:");
        int num3=sc.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println("NUM 1 IS THE LARGEST IN THREE NUMBERS");
        } else if(num2>=num1 && num2>=num3){
            System.out.println("NUM 2 IS THE LARGEST IN THREE NUMBERS");
        } else if(num3>=num1 && num3>=num2){
            System.out.println("NUM 3 IS THE LARGEST IN THREE NUMBERS");
        } else{
            System.out.println("INVALID INPUT");
        }

        sc.close();
    }
    
}
