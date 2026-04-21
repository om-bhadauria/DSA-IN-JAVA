// QUESTION 1)IN A PPROGRAM , INPUT 3 NUMBER : A,B,C .YOU HAVE TO OUTPUT THE AVERAGE OF THESE 3 NUMBERS. 

package Java_Practice_Questions;

import java.util.*;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();

        System.out.println("ENTER THE FIRST  NUMBER A =" + A);
        System.out.println("ENTER THE SECOND NUMBER B =" + B);
        System.out.println("ENTER THE THIRD  NUMBER C =" + C);

        double average =(A+B+C)/3;
        System.out.println("AVERAGE OF A,B,C ="+ average);

        sc.close();
        
        }
}
