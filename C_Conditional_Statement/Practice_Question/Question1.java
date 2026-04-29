// Question1:Write a Java program to get a number from the user and print whether it is positive or negative.

package C_Conditional_Statement.Practice_Question;
import java.util.*;
public class Question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("POSTIVE NUMBER");
        } else {
            System.out.println("NEGATIVE NUMBER");
        }
    }
}