/*
Question 1 :How many times 'Hello' is printed?
Answer 1 : 2 times -> first time on 0
                   -> second time on 3
                   -> third time on  5
*/
package Practice_Questions;
public class Number1{
    public static void main(String[] args){
        for(int i=0; i<5 ; i++){
            System.out.println("hello");
            i+=2;
        }
    }
}