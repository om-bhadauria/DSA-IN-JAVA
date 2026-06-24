/*
PRINT THE 0-1 TRIANGLE?

1            (1,1)                         ->ROW1                  (1)TOTAL LINES:5
0 1          (2,1) (2,2)                   ->ROW2                  (2)IF (i+j=even) then print 1 
1 0 1        (3,1) (3,2) (3,3)             ->ROW3                     ELSE(i+j=odd) then print 0
0 1 0 1      (4,1) (4,2) (4,3) (4,4)       ->ROW4
1 0 1 0 1    (5,1) (5,2) (5,3) (5,4) (5,5) ->ROW5

*/
package G_Pattern_Part_II;

public class E_Zero_One_Triangle {
    public static void triangle(int n){
        //OUTER LOOP
      
        for(int i=1;i<=n;i++){
            //INNER LOOPS
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        triangle(5);
    }
    
}
