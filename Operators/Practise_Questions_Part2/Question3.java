//QUESTION-NUMBER-3: WHAT WILL BE THE OUTPUT OF THIS PROGRAM?

package Operators.Practise_Questions_Part2;
public class Question3{
    public static void main(String[] args){
        int x , y , z;
        x = y = z = 2;

        x += y;
        y -= z;
        z /= (x+y);
        System.out.println(x + " " + y + " " + z);
    }
}

//output : 4 0 0

/*EXPLANATION :
1) x=y=z=2; = 2 2 2 
2) x += y; = x = x+y = 2+2 = 4
3) y -= z; = y = y-z = 2-2 = 0
4) z /= (x+y); = z = z/(x+y) = 2/(4+0) = 2/4 = 0
*/