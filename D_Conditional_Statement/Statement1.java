//QUESTION-NUMBER-1: PRINT THE LARGEST OF TWO NUMBERS USING IF-ELSE STATEMENT.

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package D_Conditional_Statement;
import java.util.*;
public class Statement1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("enter the second number:");
        int num2 = sc.nextInt();

        if(num1>=num2){
            System.out.println("num 1 is greater in two numbers");
        }else {
            System.out.println("num 2 is greater in two numbers");
        }
        sc.close();
    }
    
}

/*USING DIRECTLY
package D_Conditional_Statement;
public class Statement1{
public static void main(String[] args){
    int num 1 = 10;
    int num 2 = 20;
    if(num1>num2){
        System.out.println("num1 is greater in two numbers");
        }else{
            System.out.println("num2 is the greater in two numbers");
        }
    }
}
*/
