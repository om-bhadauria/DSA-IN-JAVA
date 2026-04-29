//QUESTION-NUMBER-2: PRINT IF A NUMBER IS ODD OR EVEN USING IF-ELSE STATEMENT.

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

package C_Conditional_Statement;
import java.util.*;
public class Statement2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("the number is even");
        } else{
            System.out.println("the number is odd");
        }
        sc.close();

    }
    
}

/*USING DIRECTLY
package D_Conditional_Statement;
public class Statement2{
public static void main(String[] args){
    int num = 10;
    if(num%2==0){
        System.out.println("the number is even");
    }else{
        System.out.println("the number is odd");
    }
  }
}
*/