//Print sum of first n natural number 


import java.util.*;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int n = sc.nextInt();
        int sum =0;
        int i =1;

        while(i<=n){
            System.out.println(sum=sum+i);
            i ++;
        }
        sc.close();
    }   
}
