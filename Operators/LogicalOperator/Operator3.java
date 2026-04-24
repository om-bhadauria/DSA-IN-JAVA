//LOGICAL NOT OPERATOR(!)

//USING SCANNER CLASS TO TAKE INPUT FROM THE USER

//METHOD-NUMBER-1

package Operators.LogicalOperator;
import java.util.*;
public class Operator3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the boolean value(true/false):");
        boolean val = sc.nextBoolean();
        boolean result = !val;
        System.out.println("the result of logical NOT operation is:" + result);
        sc.close();
    }
}