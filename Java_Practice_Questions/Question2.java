//QUESTION 2) IN A PROGRAM, INPUT THE SIDE OF THE SQUARE . YOUI HAVE TO OUTPUT THE AREA OF THE SQUARE.
// HINT(AREA OF SQUARE = SIDE * SIDE)

package Java_Practice_Questions;

import java.util.*;
public class Question2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
       
        int side = sc.nextInt();
        System.out.println("ENTER THE SIDE OF THE SQUARE = " + side);

        int area = side*side;
        System.out.println("AREA OF THE SQUARE = " + area);

        sc.close();

}
}
