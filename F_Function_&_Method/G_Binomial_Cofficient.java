public class G_Binomial_Cofficient {

    public static int factorial(int n){
        int fact =1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int binocoeff(int n , int r){                    //binocoeff = binomial coefficient
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int binocoeeff = fact_n / (fact_r * fact_nmr);
        return binocoeeff; 

    }
    public static void main(String args[]){
        System.out.println(binocoeff(5,2));
    }
}
