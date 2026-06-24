/*
PRINT THE HOLLOW RHOMBUS PATTERN? n=5 
        * * * * *    i=1 : SPACES=4,STARS=5  ; SPACES=4:n-i=5-1=4             (1)TOTAL LINES :5
      *       *      i=1 : SPACES=3,STARS=2  ; SPACES=3:n-i=5-2=3             (2)LINES : SPACES + BOUNDARY RECTANGLE
    *       *        i=1 : SPACES=2,STARS=2  ; SPACES=2:n-i=5-3=2
  *       *          i=1 : SPACES=1,STARS=2  ; SPACES=1:n-i=5-4=1
* * * * *            i=1 : SPACES=0,STARS=5  ; SPACES=4:n-i=5-1=4  

*/

package G_Pattern_Part_II;
public class H_Hollow_Rhombus {
    public static void hollow_rhombus(int n){
        //OUTER LOOPS
        for(int i=1;i<=n;i++){
            //INNER LOOPS

            //SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //HOLLOW RECTANGLE
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
         System.out.println("");
        }
    }
    
    public static void main(String args[]){
        hollow_rhombus(5);
    }
}
