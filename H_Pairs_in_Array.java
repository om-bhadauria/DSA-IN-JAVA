/*
------------
|2|4|6|8|10|         pairs:(2,4),(2,6),(2,8),(2,10),(4,6),(4,8),(4,10),(6,8),(6,10),(8,10)
------------

n eleemnts ; find the total pairs : formula : n(n-1)/2

TIME COMPLEXITY = O(n^2) -nested loops ; outer loop(worst case)=O(n)
                                         inner loop(worst case)=O(n)
 */
public class H_Pairs_in_Array {

    public static void printpairs(int numbers[]){
        int tp= 0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i]; //2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" + tp);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);
    }
}
