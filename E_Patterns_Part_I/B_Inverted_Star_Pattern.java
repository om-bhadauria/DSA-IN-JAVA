/*
Question.2.) Print this pattern?
****                                      (1)Lines:4     ;outer loop:4
***                                       (2)Number of times:j ; inner loop:j
**                                        (3)What to print ? : "*"
*
*/


package E_Patterns_Part_I;
public class B_Inverted_Star_Pattern{
    public static void main(String[] args){
         for (int i =4 ; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }

}

/* 
package E_Patterns_Part_I;
public class B_Inverted_Star_Pattern{
    public static void main(String[] args){
         for (int i=1 ; i<=1;i++){
            for(int j=1; j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }

} 
*/