//QUESTION-NUMBER-5: WHAT WILL BE THE OUTPUT OF THIS PROGRAM?

package C_Operators.f_Practise_Questions_Part2;
public class Question5 {
    public static void main(String[] args){
        int x =10, y=5;

        int exp1=(y* (x/y + x/y ) );
        int exp2=(y*x / y+y * x/ y );

        System.out.println(exp1);
        System.out.println(exp2);
    }
}

//output: 20
//        20

/* Explanation:
 * exp1 = y * (x/y + x/y) = 5 * (10/5 + 10/5) = 5 * (2 + 2) = 5 * 4 = 20
 * exp2 = y*x/y + y*x/y = 5*10/5 + 5*10/5 = 10 + 10 = 20
 */