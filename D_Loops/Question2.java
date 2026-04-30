//print the number from 1 to n
package D_Loops;
import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE n VALUE :");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n) {
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
