//QUESTION-NUMBER-2: WHAT WILL BE THE OUTPUT OF THIS PROGRAM?

package C_Operators.f_Practise_Questions_Part2;
public class Question2 {
    public static void main(String[] args){
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        } if(z > y && z < x){
            System.out.println("Java");
        } if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");


    }
    }
}

// ouput : Java

/*EXPLANATION :
1) x > y && y > z = 200 > 50 && 50 > 100 = true && false = false
2) z > y && z < x = 100 > 50 && 100 < 200 = true && true = true
3) (y+200) < x && (y+150) < z = (50+200) < 200 && (50+150) < 100 = 250 < 200 && 200 < 100 = false && false = false
*/