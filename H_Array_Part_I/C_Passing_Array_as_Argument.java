/*
PASSING ARRAY AS ARGUMENT
MAINLY TWO TYPES OF PASSING ARRAY AS ARGUMENT
1. PASS BY VALUE : 
2. PASS BY REFERENCE : 


*/

public class C_Passing_Array_as_Argument {

    public static void update(int marks[] , int nonchangable){          //PASS BY REFERENCE
        nonchangable = 10;
        for(int i=0; i<marks.length; i++){                                 //UPDATE THE MARKS BY CALL BY REFERENCE
            marks[i] =marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] ={97,98,99};
        int nonChangable = 6;
        update(marks, nonChangable); //CALL BY REFERENCE
        System.out.println(nonChangable); //PRINTING NONCHANGEABLE VALUE

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
         
    }
    
}
