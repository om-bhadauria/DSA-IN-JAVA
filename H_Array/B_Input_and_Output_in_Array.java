
import java.util.*;

public class B_Input_and_Output_in_Array {
    public static void main(String[] args){
        // Code for input in array
        int marks[] =new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //chemistry marks
        marks[1] = sc.nextInt(); //physics marks
        marks[2] = sc.nextInt(); //maths marks]

        System.out.println("chemistry marks:" +marks[0]);
        System.out.println("physics marks:" +marks[1]);
        System.out.println("maths marks:" +marks[2]);

        marks[1] = 100; //updating physics marks
        System.out.println("Physics marks :" +marks[1]);


        marks[2] = marks[2] +10; //updating maths marks
        System.out.println("Maths marks :" +marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage :" +percentage);

        //length of array:
        System.out.println("length of array:"+ marks.length); //here .dot operator represents the length of array 


    }
}
