// product of a&b using input

import java.util.*;

public class JavaBasic9{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        sc.close();

        int a =sc.nextInt();
        int b = sc.nextInt();
        int product=a*b;
        
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("Product="+product);
    }

}