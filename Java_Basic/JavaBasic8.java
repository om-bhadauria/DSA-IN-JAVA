// sum of a & b using input class

import java.util.Scanner;

public class JavaBasic8{
    public static void  main(String arg[]){
        Scanner sc = new Scanner(System.in);
        sc.close(); 
        /*
        why we use sc.close(); ?
        1)prevents resource leaks
        2)avoiding file/system locking issues
        3)shows disciplane
        */
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("A = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);
    }
}