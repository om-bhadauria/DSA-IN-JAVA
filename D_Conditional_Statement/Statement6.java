// make a calculator using switch : +,-,*,/,%

package D_Conditional_Statement;
import java.util.*;
public class Statement6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER:");
        int num1 = sc.nextInt();
        System.out.print("ENTER THE SECONF NUMBER:");
        int num2 =sc.nextInt();
        double calculator =sc.nextDouble();

        switch(calculator){
            case 1: System.out.println(num1 + num2);
            break;
            case 2: System.out.println(num1 - num2);
            break;
            case 3: System.out.println(num1 * num2);
            break;
            case 4: System.out.println(num1 / num2);
            break;
            case 5:System.out.println(num1 % num2);
            break;
            default : System.out.println("invalid number");
        }
    }
    
}
