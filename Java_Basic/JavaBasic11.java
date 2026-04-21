/*               TYPE OCNVERSION
conversion happens when :
1)type compatible ex: 4byte se 8 byte mein jayega toh compatible hai 
2) destination type > source type

byte -> short ->cint -> float -> long -> double
 */
import java.util.*;

public class JavaBasic11 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();

       // int a=25;    
       //long b=a;
       //System.out.println(b);

       //conversion possible from int to long but not in long to int

        //long c=25;
        //int d=c;
        //System.out.println(d);
        
        float number =sc.nextInt();
        System.out.println(number);

    
    }

}
