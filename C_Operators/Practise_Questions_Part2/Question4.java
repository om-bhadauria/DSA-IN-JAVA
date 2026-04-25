////QUESTION-NUMBER-4: WHAT WILL BE THE OUTPUT OF THIS PROGRAM? 

package C_Operators.Practise_Questions_Part2;
public class Question4 {
    public static void main(String[] args){
        int x=9, y=12;
        int a=2 , b=4 , c=6;

        int exp = 4/3 * (x+34) + 9 *(a+b*c) + (3+y*(2+a))/(a+b*y);
        System.out.println(exp);

    }
    
}
 
//output : 278

/*EXPLANATION :
1) 4/3 * (x+34) = 4/3 * (9+34) = 1 * 43 = 43
2) 9 *(a+b*c) = 9 *(2+4*6) = 9 *(2+24) = 9*26 = 234
3) (3+y*(2+a))/(a+b*y) = (3+12*(2+2))/(2+4*12) = (3+12*4)/(2+48) = (3+48)/50 = 51/50 = 1
4) exp = 43 + 234 + 1 = 278
*/