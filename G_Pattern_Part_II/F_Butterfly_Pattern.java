/*
PRINT THE BUTTERFLY PATTERN? n=4

*             *    }       i=1;STAR=1 ,SPACE=6,STAR=1   ; SPACE=6(2*3)=2*(n-i)           (1)TOTAL LINES = 4
* *         * *    }1ST    i=2;STAR=2 ,SPACE=4,STAR=2   ; SPACE=6(2*2)=2*(n-i)           (2)LINES : STAR + SPACE + STAR
* * *     * * *    }HALF   i=3;STAR=3 ,SPACE=2,STAR=3   ; SPACE=6(2*1)=2*(n-i)
* * * * * * * *    }       i=4;STAR=4 ,SPACE=0,STAR=4   ; SPACE=6(2*0)=2*(n-i)
--mirrror-img--
* * * * * * * *
* * *     * * *
* *         * *  
*             *

*/
package G_Pattern_Part_II;

public class F_Butterfly_Pattern {
    public static void butterfly(int n){
        //OUTER LOOPS

        //1ST HALF
        for(int i=1;i<=n;i++){
            //STARS - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.err.print(" ");
            }
            //STARS - i
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
         System.out.println();

        }

        //2ND HALF
        for(int i=n; i>=1;i--){
            //STARS - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.err.print(" ");
            }
            //STARS - i
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
         System.out.println();
        }
    }

    public static void main(String args[]){
        butterfly(4);
    }
    
}
