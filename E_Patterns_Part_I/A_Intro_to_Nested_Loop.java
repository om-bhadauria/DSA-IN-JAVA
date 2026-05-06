/*
Question.1.) print this patterns?
*                                         1)lines = 4      ; outer loops:4 
**                                        2)no.of times =i ; inner loops:i
***                                       3)What to print? : "*"
****

*/
package E_Patterns_Part_I;
public class A_Intro_to_Nested_Loop{
    public static void main (String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}