/*
PRINT THE FLOYD'S TRIANGLE?

1                   i=1;COUNTER-PRINT=1        (1)TOTAL LINE =5 ,int counter=1;
2  3                i=2;COUNTER-PRINT=2        (2)for(int i=1;i<=n;i++){    
4  5  6             i=3;COUNTER-PRINT=3               for(intj=1;j<=i;j++){}
7  8  9  10         i=4;COUNTER-PRINT=4           }
11 12 13 14 15      i=5;COUNTER-PRINT=5 

*/
package G_Pattern_Part_II;
public class D_Floyd_Triangle_Pattern {
    public static void floyd_triangle(int n){
        //OUTER LOOPS : REPRESENT TOTAL NUMBER OF LINES
        int counter=1;
        for(int i=1 ;i<=n;i++){
            //INNER LOOPS : HOW MANY TIME THE COUNTER WILL PRINTED
            for(int j=1 ; j<=i ;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        floyd_triangle(5);
    }
}
