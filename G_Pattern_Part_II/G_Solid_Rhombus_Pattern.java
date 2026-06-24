/*
PRINT THE SOLID RHOMBUS PATTERN? N=5
        * * * * *    i=1 : SPACES=4,STARS=5  ; SPACES=4:n-i=5-1=4             (1)TOTAL LINES :5
      * * * * *      i=1 : SPACES=3,STARS=5  ; SPACES=3:n-i=5-2=3             (2)LINES : SPACES + STARS
    * * * * *        i=1 : SPACES=2,STARS=5  ; SPACES=2:n-i=5-3=2
  * * * * *          i=1 : SPACES=1,STARS=5  ; SPACES=1:n-i=5-4=1
* * * * *            i=1 : SPACES=0,STARS=5  ; SPACES=0:n-i=5-5=0
*/

package G_Pattern_Part_II;
public class G_Solid_Rhombus_Pattern {
    public static void solid_rhombus(int n){
        //OUTER LOOPS
        for(int i=1;i<=n;i++){
            //INNER LOOPS 
            //SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

         System.out.println("");
        }
    }

    public static void main(String args[]){
        solid_rhombus(5);
    }
}
