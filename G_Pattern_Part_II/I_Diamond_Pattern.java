/*
PRINT THE DIAMON PATTERN ? n=4
   *                    i=1;Space=3,Star=1;Space=3
  ***                   i=2;Space=2,Star=3;Space=2
 *****                  i=3;Space=1,Star=5;Space=1
*******                 i=4;Space=0,Star=7;Space=0
---------->MIROR-IMG
*******
 *****
  ***
   *
*/
package G_Pattern_Part_II;
public class I_Diamond_Pattern {
    public static void diamond(int n){
        //OUTER LOOP
        //1st HALF
        for(int i=1;i<=n;i++){
            
            //SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

          System.out.println();
        }

        //2ND HALF
        for(int i=n;i>=1;i--){
            
            //SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

          System.out.println();
        }
    }

    public static void main(String args[]){
        diamond(4);
    }
    
}
