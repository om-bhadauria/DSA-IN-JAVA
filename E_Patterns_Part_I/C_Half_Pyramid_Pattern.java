/*
Question.3.)Print half-pyramid pattern?
1
12
123
1234
*/

package E_Patterns_Part_I;
public class C_Half_Pyramid_Pattern{
    public static void main(String[] args){
        for(int i=1; i<=4;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}