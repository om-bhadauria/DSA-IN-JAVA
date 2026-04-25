/*QUESTION-NUMBER-3: INCOME TAX CALCULATOR USING ELSE-IF STATEMENT.
 CASE1: 5L THEN 0% TAX
    CASE2: 5L TO 10L THEN 20% TAX
    CASE3: ABOVE 10L THEN 30% TAX
*/
package D_Conditional_Statement;
import java.util.*;
public class Statement3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the income:");
        int income = sc.nextInt();
        
        if(income<=500000){
            System.out.println("the tax is 0%");
            System.out.println("TAX CUTTING IS " + income);
        } else if(income>=500000 && income<=1000000){
            System.out.println("the tax is 20%");
            System.out.println("TAX CUTTING IS " + income*0.20);
        }else if(income>1000000){
            System.out.println("the tax is 30%");
            System.out.println("TAX CUTTING IS " +income*0.30);
        }else{
            System.out.println("invalid income");
        }

        sc.close();
    }
    
}
