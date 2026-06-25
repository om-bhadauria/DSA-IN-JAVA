/*
LINEAR SEARCH : FIND THE INDEX OF ELEMENT IN A GIVEN ARRAY

TIME COMPLEXITY OF LINEAR SEARCH IS O(N) : N IS THE SIZE OF ARRAY
EXAMPLE:

KEY=10
---------------------
|2|4|6|8|10|12|14|16|
---------------------
*/
public class D_Linear_Search{
    public static int linear_search(int numbers[] ,int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10,12,14,16};
        // String menu ={"coca-cola" , "pepsi" , "diet-coke" , "sprite" , "fanta"};
        int key =10;

        int index = linear_search(numbers,key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index :" +index);
        }
        
    }
}

