/*
Question.4.)Print character pattern?
A
BC
DEF
GHIJ
*/
package E_Patterns_Part_I;
public class D_Print_Character_Pattern {
    public static void main(String[] args){
        char ch='A';
        for(char i=1; i<=4 ; i++){
            for(char j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
