public class G_Reverse_An_Array {

    public static void reverse(int numbers[]){
        int first=0 ,last= numbers.length-1;

         while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
         }
    }

    public static void main(String args[]){
         int numbers[] ={2,4,6,8,10};

         reverse(numbers);
         for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
         }
      
    }

}

/*
TIME COMPLEXITY OF REVERSE AN ARRAY IS O(N) : N IS THE SIZE OF ARRAY
SPACE COMPLEXITY OF REVERSE AN ARRAY IS O(1) : NO EXTRA SPACE IS USED
*/
