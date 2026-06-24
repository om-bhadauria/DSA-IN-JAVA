public class O_Decimal_to_Binary {
    public static void decToBin(int n ){
        int mynum =n ;
        int pow = 0 ;
        int binnum = 0 ;
         
        while(n > 0){
            int remainder = n % 2 ;
            binnum = binnum + (remainder * (int)Math.pow(10, pow));
             
            pow++;
            n = n/2;
        }

        System.out.println("binary of :" + mynum + "=" + binnum);

    }
    public static void main(String args[]){
        decToBin(7);
    }
}
