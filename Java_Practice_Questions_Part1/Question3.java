/*
Question 3) Enter cost of 3 items from the user (using float datatype) - a pencil, a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.

(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

package Java_Practice_Questions_Part1;

import java.util.*;

public class Question3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        float pen =sc.nextFloat();
        System.out.println("enter the cost of the pen :" +pen);

        float pencil = sc.nextFloat();
        System.out.println("enter the cost of the pencil :" + pencil );

        float eraser = sc .nextFloat();
        System.out.println("enter the cost of the eraser :" + eraser);


        float total = pen + pencil + eraser;
        System.out.println("the total cost of the items is :" + total);
        
        //add gst tax to the bill
        
        float gst = (total * 18) / 100;
        System.out.println("the gst tax is :" + gst);

        float bill = total + gst;
        System.out.println("the total bill is :" + bill);     
        
        sc.close();

    }
    
}
