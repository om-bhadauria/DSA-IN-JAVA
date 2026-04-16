/*              TYPE PROMOTION IN EXPRESSION
1) If the data types of the operands are different, then Java promotes the smaller data type to the larger data type.
2) If one of the operands is of type double, then the other operand is promoted to double.
3) If one of the operands is of type float, then the other operand is promoted to float.
4) If one of the operands is of type long, then the other operand is promoted to long.
5) If one of the operands is of type int, then the other operand is promoted to int.     

A) In the following example, the data type of the variable 'c' is int, but the result of the expression 'a + b'
   is promoted to double because one of the operands (b) is of type double. Therefore, we need to cast the result
   back to int before assigning it to 'c'.   
 */

public class JavaBasic13 {
public static void main (String[] args) {
    char a= 'a';
    char b= 'b';
    System.out.println((int)(a));
    System.out.println((int)(b));
    System.out.println(b-a);
    System.out.println(a);
}
}

/*
Type promotion is only happens in expressions, not in variable assignments. In the above code, the characters 
'a' and 'b' are promoted to their corresponding ASCII values (97 and 98 respectively) when we cast them to int.
the expression 'b - a' results in 1 because the ASCII value of 'b' is 98 and the ASCII value of 'a' is 97.  
*/

/*
But in the end there is only variable that why they only print the a because the type promotion only occurs on 
the operation
*/ 


/*
TYPE PROMOTION OF EXPRESSION 
A)JAVA AUTOMATICALLY PROMOTE EACH BYTE ,SHORT & CHAR OPERAND TO THE INT WHEN EVALUATING AN EXPRESSION 
B)IF ONE OPERANDS IS LONG , FLOAT & DOUBLE THE WHOLE EXPRESSION IS PROMOTED TO THE LONG , FLOAT , DOUBLE RESPECTIVELY
*/