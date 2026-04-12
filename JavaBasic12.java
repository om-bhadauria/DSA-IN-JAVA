/*            TYPE CASTING         
  also c/d as  'narrowing conversion' & 'explicit conversion'

->ERROR IF WE CHANGE DIRECTLY FLOAT INTO INT 
EX: float a =20.0;
    int b =a ;

->NO ERROR IF WE USE SPECIFIC CASTING 
EX: float a =20.0;
    int b =(int)a ;

 */

import java.util.*;

public class JavaBasic12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       // float a=20.14f;
       // int b =a;

       float a =20.14f;
       int b =(int)a;
       System.out.println(b);


       //char ch ='a';
       //char ch2 ='b';
       //int number = ch;
       //int number2 = ch2;
       //System.out.println(number);
       //System.out.println(number2);

       // they contains numbers in the char value like a is 97 then b ia 98 and c is 99 , d is 100 and continue.
       

       // this is all about type casting 
    }
}
