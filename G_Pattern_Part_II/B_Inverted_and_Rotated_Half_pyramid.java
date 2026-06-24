/*
PRINT THE INVRTED & ROTATED HALF PYRAMID 

      *  ->ROW1 :SPACES=3 ; STAR=1                    (1) TOTAL ROWS : TOTAL LINES 4
    * *  ->ROW2 :SPACES=2 ; STAR=2                    (2) SPACES +STARS
  * * *  ->ROW3 :SPACES=1 ; STAR=3 
* * * *  ->ROW4 :SPACES=0 ; STAR=4 

*/

package G_Pattern_Part_II;
public class B_Inverted_and_Rotated_Half_pyramid {
    public static void half_pyramid(int n){
        //outer loops
        for(int i=1;i<=n;i++){
            //inner loop
            
            //SPACES
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

         System.out.println();

        }
    }

    public static void main(String[] args) {
        half_pyramid(4);
    }
    
}
