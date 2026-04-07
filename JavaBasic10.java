//find the area of the circle

import java.util.*;

public class JavaBasic10{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle=");

        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;

        System.out.println("area of the circle=" + area);
    }
    
}