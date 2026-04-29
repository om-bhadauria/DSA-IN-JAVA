/*Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise
  prints You don't have a fever 
  
 public class solution{
    public static void main(String[] args){
    double =103.5
    }
} 
*/

package C_Conditional_Statement.Practice_Question;
import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE TEMPERATURE");
        double temp =sc.nextDouble();

        if(temp>100){
            System.out.println("YOU HAVE A FEVER");
        }else{
            System.out.println("YOU DON'T HAVE A FEVER");
        }

        sc.close();
    }
    
}
