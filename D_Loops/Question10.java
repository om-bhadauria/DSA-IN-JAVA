//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10
//continue statement question

import java.util.*;
public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("ENTER THE NUMBER:");
            int n = sc.nextInt();
            if(n % 10==0){
                break;  // here we use the continue then the loop continue forever menas whenever user put multiple of 10 they again
                        // asking him the next number that means the loops continue forever.

            }
            System.out.println("number was : " + n);
        } while(true);
        sc.close();
    }
}
