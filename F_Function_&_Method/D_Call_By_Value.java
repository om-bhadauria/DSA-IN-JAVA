
public class D_Call_By_Value {

    public static void swap (int a , int b){
        //swap =value excahange 
        int temp = a; 
        a = b ;
        b = temp;

        System .out.println("the value of a is : " + a);
        System .out.println("the value of b is : " + b);
    }

    public static void main (String args[]){
        //swap =value excahange 
        int a= 5;
        int b= 10;
        swap(a,b);


       /*  
       //swap
        int temp = a; 
        a = b ;
        b = temp;

        System .out.println("the value of a is : " + a);
        System .out.println("the value of b is : " + b);   
        */
    }
}
