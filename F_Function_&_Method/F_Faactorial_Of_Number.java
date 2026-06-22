public class F_Faactorial_Of_Number {
    public static int factorial(int n){
        int fact =1 ;
        for (int i=1 ; i<=n ; i++){
            fact = fact*i ;
        }
        return fact ;
    }
    public static void main (String args[]){
        int result = factorial(5);
        System.out.println("the factorial of 5 is " + result);
    }
}
