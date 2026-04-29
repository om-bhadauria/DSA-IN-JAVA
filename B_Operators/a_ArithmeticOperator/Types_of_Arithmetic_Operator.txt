ARITHMETIC OPERATORS
a) Unary Arithmetic Operators(1 operand):

i)Increment(++) : (a) pre increment:  ++a 
                  (b) post increment: a++
ii)Decrement(--): (a) pre decrement:  --a 
                  (b) post decrement: a--
                   
b) Binary Arithmetic Operators(2 operands):

i)Addition Operator(+)
ii)Subtraction Operator(-)
iii)Multiplication Operator(*)
iv)Division Operator(/)
v)Modulus Operator(%) : they give the reminder of the division operation for eg) 5%2 = 1

c)tarnary Arithmetic Operator(3 operand):
variable = (condition) ? expression1 : expression2;
for eg) 
boolean large =(5>3)?5:3; 
 // here 5>3 is the condition, 5 is the expression1 and 3 is the expression2. if the condition is true then the value of 
 // large will be 5 otherwise it will be 3.    
   
NOTE NUMBER 01
->IN THE PRE INCREMENT OR PRE DECREMENT
i)First we change the value
ii)Second we use the value 

For eg;
PRE-INCREMENT                       PRE-DECREMENT
int a=10;                           int a=10;
int b=++a;                          int b=--a;
System.out.println(a);              System.out.println(a);
System.out.println(b);              System.out.println(b);

OUTPUT: 11                          OUTPUT:9
        11                                 9

NOTE NUMBER 02
->IN THE POST INCREMENT OR POST DECREMENT
i)First we use the value
ii)Second we change the value 

For eg;
POST-INCREMENT                      POST-DECREMENT
int a=10;                           int a=10;
int b=a++;                          int b=a--;
System.out.println(a);              System.out.println(a);
System.out.println(b);              System.out.println(b);

OUTPUT: 11                         OUTPUT:9
        10                                10
        
c) Ternary Arithmetic Operators(3 operands)
*/
