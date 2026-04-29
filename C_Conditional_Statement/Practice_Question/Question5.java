//Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not
/*hint :is year is divisible by 4 : yes : leap year
        is year is divisible by 100 : yes : leap year
        is year is divisible by 400 : yes : leap year
 */

package C_Conditional_Statement.Practice_Question;
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE YEAR :");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 ==0) && (year % 400 ==0));

        if (x && (y||z) ){
            System.out.println(year + "IS A LEEP YEAR");
        }else {
            System.out.println(year + "is not a leep year");
        }
        sc.close();
    }
    
}
