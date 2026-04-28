package D_Conditional_Statement;
import java.util.*;
public class Statement5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button =sc.nextInt();

        switch(button){
            case 1:System.out.println("pizza");
            break;
            case 2:System.out.println("mango");
            break;
            case 3:System.out.println("burger");
            break;
            default : System.out.println("invalid button");
        }
    }
    
}
