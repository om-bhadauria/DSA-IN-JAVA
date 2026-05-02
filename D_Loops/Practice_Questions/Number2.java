//Question 2 : Write a program that reads a set of integers , and then prints the sum of the even and odd integers

package Practice_Questions;
import java.util.*;
public class Number2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.println("ENTER THE NUMBER :");
             number = sc.nextInt();

            if(number %2==0){
               evensum += number;
            }else{
                oddsum+=number;
            }

            System.out.println("DO YOU WANT TO CONTINUE? PRESS 1 FOR YES OR 0 FOR NO");
             choice =sc.nextInt();

        }while(choice==1);

        System.out.println("SUM OF EVEN NUMBER :" +evensum);
        System.out.println("SUM OF ODD NUMBER :" +oddsum);         
        sc.close();
    }
    
}
