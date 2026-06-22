public class E_Product_of_A_and_B {
    public static int multiply(int a , int b) {
        int product = a*b ;
        return product  ;
    }

    public static void main(String args[]){
        int result = multiply(3,5);
        System.out.println("the product of two number is " + result);
        result = multiply(10,20);
        System.out.println("the product of two number is " + result);
    }
}
