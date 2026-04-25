//QUESTION-NUMBER-1: WHAT WILL BE THE OUTPUT OF THIS PROGRAM?

package C_Operators.Practise_Questions_Part2;
 public class Question1 {
    public static void main(String[] args){
        int x = 2, y = 5;

        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));

        System.out.println(exp1 );
        System.out.println(exp2 );
    }
 }

 // ouput : 5
 //         4

/*EXPLANATION :
exp1 = (x*y/x) = (2*5/2) = 10/2 = 5
exp2 = (x*(y/x)) = (2*(5/2)) = 2*2 = 4
*/