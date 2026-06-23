/* Check if a number is prime or not 

prime number : number is prime only when it is divide by 1 or n only 

Approach 1 :  for(int i =2 to i= n-1) 
              n%i == 0 ; NOT PRIME 

prime contain 2 specific case known as 'CORNER CASES'
*/

// public class L_Check_if_a_Number_is_Prime_or_not{

//     //only for n>=2
//     public static boolean isprime(int n){

//         //coorner case 
//         //2
//         if( n == 2){
//             return true;
//         }

//         boolean isprime =true;           
//         for(int i=2 ; i<=n-1 ; i++){
//             if(n % i == 0){             //Completely dividing 
//                 isprime = false ;
//                 break;                  // here we can directly write 'return isprime' & remove break becuase we don't need to wait for completing the loop. 
//             }                           // here if we type 'return false' in this section and in last section we just write 'return true' & remove the first line 'boolean is prime = true' also that happens this working correctly.
//         }
//         return isprime;                      
//     }

//     public static void main(String args[]){
//         System.out.println(isprime(2));
//     }
// }


// Approach 2 (optimized methods) : 

public class L_Check_if_a_Number_is_Prime_or_not{

    public static boolean isprime(int n){

        if(n == 2){
            return true;
        }

        for(int i=2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){
               return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println(isprime(7));
    }
}