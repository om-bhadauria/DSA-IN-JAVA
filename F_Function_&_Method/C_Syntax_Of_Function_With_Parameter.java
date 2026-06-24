/*public static is accesses modifier means the method belongs to the class and can be called without 
creating an object of the class */

import java.util.*;
public class C_Syntax_Of_Function_With_Parameter {

    public static int CalculateSum(int a , int b){  //(int a , int b) are parameters or formal parameter.
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum =CalculateSum(a,b); //(a,b) are arguments or actual parameter.
        System.out.println("the sum is : " + sum);
     
    } 
}

/*
TYPES OF PARAMETERS
1. Formal Parameters & PARAMETERS: (DEFINATION) These are the parameters defined in the method signature.
2. Actual Parameters & ARGUMENTS: (CALLING STAGE) These are the values passed to the method when it is called.
 */