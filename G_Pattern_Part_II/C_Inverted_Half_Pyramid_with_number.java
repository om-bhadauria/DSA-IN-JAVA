/*
PRINT THE INVERTED HALF PYRAMID OF NUMBERS ?

1 2 3 4 5         i=1 ; 1to5   : n-i+1=5-1+1=5                (1)TOTSAL LINES : 5
1 2 3 4           i=2 ; 1to4   : n-i+1=5-2+1=4                (2)for(int i=1;i<=n;i++){
1 2 3             i=3 ; 1to3   : n-i+1=5-1+1=3                    for(int j=1; j<=n-i+1;j++){}
1 2               i=4 ; 1to2   : n-i+1=5-1+1=2                    }
1                 i=5 ; 1to1   : n-i+1=5-1+1=1

 */
package G_Pattern_Part_II;
public class C_Inverted_Half_Pyramid_with_number{
    public static void half_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        half_pyramid(5);
    }}