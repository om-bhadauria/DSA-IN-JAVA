// sum of a & b using input class

import java.util.Scanner;

public class JavaBasic8{
    public static void  main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("A = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);
    }
}