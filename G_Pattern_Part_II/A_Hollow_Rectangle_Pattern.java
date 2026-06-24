/*
PRINT THE HOLLOW RECTANGLE PATTERN 

* * * * *    -> ROW 1
*       *    -> ROW 2
*       *    -> ROW 3        SIZE = ROWS * COLUMN        ; (1)TOTAL LINES : TOTAL ROWS TO PRINT :OUTER LOOPS (1 TO 4)
* * * * *    -> ROW 4             = 4 * 5                ; (2) ROW=1 || COL=1 || ROW=4 || COL=5

^ ^ ^ ^ ^
| | | | |
C C C C COLUMN
1 2 3 4 5

*/
package G_Pattern_Part_II;
public class A_Hollow_Rectangle_Pattern{
    
    public static void hollow_rectangle(int totRows , int totCols){
        //outer loops; i:lines
        for(int i=1 ; i<=totRows; i++){
            //inner loops -columns
            for(int j=1; j<=totCols; j++){
                //cell (i,j)
                if(i == 1 || i == totRows || j == 1 ||j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}