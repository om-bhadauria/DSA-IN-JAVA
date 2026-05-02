//CHECK A NUMBER IS PRIMEOR NOT :3,5,7,11,13,17,,19...........

import java.util.*;
public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(n ==2 ){
            System.out.println("n is prime");
        } else{
        boolean isprime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){ //n is multiple of i (i not equal to 1 or n)
                isprime = false;
            }
        }
            
        
        if(isprime==true){
           System.out.println(" n is a prime number");
        }else{
            System.out.println("n is not prime");
        }
        }
        sc.close();

    }
}
