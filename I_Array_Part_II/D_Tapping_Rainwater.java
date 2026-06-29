/*                        TAPPING RAINWATER(DSA 22 PROBLREM IN LEETCODE)

->GIVEN N NON-NEGATIVE INTEGER REPRESENTING AN ELEVATION(height) MAP WHERE THE WIDTH OF EACH BAR IS 1 ,COMPUTE HOW MUCH WATER IT CANT TRAP AFTER RAINING.

HEIGHT :[4,2,0,6,3,2,5]
               █
               █     █
         █     █     █
         █     █ █   █
         █ █   █ █ █ █
         █ █   █ █ █ █
         0 2 4 0 2 3 0 -> 2+4+2+3 -> 11
──────────bar graph──────────

#CASES
CASE.1.) SINGLE BAR : WATER TRAP = 0
CASE.2.) DOUBLE-BAR : WATER TRAP = 0               
CASE.3.) TRIPLE-BAR : WATER TRAP =     

#IMPORTANT THINGS RELATED TO QUESTION:
(1)MINIMUM NUMBER OF BARS > 2
(2)ASCENDING & DESCENDING BAR CONTAIN NO WATER IS TRAPPED
(3)WATER LEVEL = MINIMUM (MAXIMUM OF LEFT SIDE , MAXIMUM OF RIGHT SIDE) = MIN (MAX-LEFT,MAX-RIGHT)
#EXPLANATION :
+---+     
|   |     +---+   
|   |/////|   |      ^                   here: w =height of the water
|   |/////|   |      |                         x =height of the bar 
|   |/////|   |      |                         1 =width of the bar 
|   |+---+|   | ^    |w                   
|   |     |   | |    |                  TAPPING RAINFALL WATER FORMULA : (w-x) * width 
|   |     |   | | x  |                                                 : (WATERLEVEL - BARLEVEL/HEIGHT) * WIDTH
|   |+---+|   | |    |
+-------------+ v    v
    <--1-->

AFTER ALL THIS ANALYSIS NOW WE HAVE FINAL FORMULA TO FIND A TRAP WATER 

TRAP WATER FORMULA :(WATER-LEVEL - HEIGHT) * WIDTH                       [HERE WE KNOW THE 'HEIGHT' IS GIVEN AND 'WIDTH' IS ALSO GIVEN] 
                   :{ [MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT } * WIDTH 

#NOW CHECK FOR EACH ONE OF THE HEIGHT:

HEIGHT:[4,2,0,6,3,2,5]
               █
               █     █
         █     █     █
         █     █ █   █
         █ █   █ █ █ █
         █ █   █ █ █ █
──────────bar graph──────────
HEIGHT=4 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(4,6)] - 4} * 1
                       = {4-4}
                       = 0
HEIGHT=2 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(4,6)] - 2} * 1
                       = {4-2}
                       = 2
HEIGHT=0 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(4,6)] - 0} * 1
                       = {4-0}
                       = 4
HEIGHT=6 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(6,5)] - 6} * 1
                       = {6-6}
                       = 0
HEIGHT=3 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(6,5)] - 3} * 1
                       = {5-3}
                       = 2
HEIGHT=2 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(6,5)] - 2} * 1
                       = {5-2}
                       = 3
HEIGHT=5 ;  TRAP WATER = {[MIN(MAX-LEFT,MAX-RIGHT)] - HEIGHT} * WIDTH 
                       = {[MIN(6,5)] -5} * 1
                       = {5-5}
                       = 0

TRAP WATER FOR HEIGHT VALUE 1 = 0
TRAP WATER FOR HEIGHT VALUE 2 = 2
TRAP WATER FOR HEIGHT VALUE 3 = 4
TRAP WATER FOR HEIGHT VALUE 4 = 0
TRAP WATER FOR HEIGHT VALUE 5 = 2
TRAP WATER FOR HEIGHT VALUE 6 = 3
TRAP WATER FOR HEIGHT VALUE 7 = 0

TOTAL TRAP WATER = 0+2+4+0+2+3+0
                 = 11

AUXILIARY ARRAY(HELPER ARRAY) : TO FIND THE MAXIMUM OF LEFT & MAXIMUM OF RIGHT 

HEIGHT:[4,2,0,6,3,2,5]
(1) Left maximum boundary : |4|4|4|6|6|6|6|
(2)Right maximum boundary : |6|6|6|6|5|5|5| 

#Steps for write code:
Step.1.)CALCULATE LEFT MAX BOUNDARY   - AUXILLARY ARRAY
Step.2.)CALCULATE RIGHT MAX BOUNDARY  - AUXILLARY ARRAY
Step.3.)CREATE A LOOP
Step.4.)waterlevel = min(left max boundary , right max boundary) 

#TIME COMPLEXITY IS DIRECTLY PROPORTIONAL TO THE BAR OF THE HEIGHT : O(N) ; MOST OPTIMIZATION METHOD TO USING AN ARRAY

*/
package I_Array_Part_II;

public class D_Tapping_Rainwater {
  
  public static int trappedrainwater(int height[]){
    int n=height.length;                       //height.length = n

    //Step.1.)CALCULATE LEFT MAX BOUNDARY   - AUXILLARY ARRAY
    int leftmax[] = new int[n];           
    leftmax[0] = height[0];
    for(int i=1 ;i<n; i++){
      leftmax[i] = Math.max(height[i] ,leftmax[i-1]);
    }

    //Step.2.)CALCULATE RIGHT MAX BOUNDARY  - AUXILLARY ARRAY
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int i=n-2 ; i>=0 ;i--){
      rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }

    int trappedwater = 0 ;
    //Step.3.)CREATE A LOOP
    for(int i=0; i<n; i++){

      //Step.4.)waterlevel = min(left max boundary , right max boundary)
       int waterlevel= Math.min(leftmax[i] , rightmax[i]);

      //Step.5.)trapped water = waterfall - height[i]
      trappedwater += waterlevel - height[i];
    }

    return trappedwater;

  }
  public static void main(String[] args) {
    int height[] ={4,2,0,6,3,2,5};  
    System.out.println(trappedrainwater(height));
  }
    
}
