package examples;

import static java.lang.Math.PI;
import java.util.Scanner;

public class ComputeAreaIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double radius = input.nextDouble();
        if(radius >= 0){
            double area = radius * radius * PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else{
            System.out.println("Negative input");
        }
    }
}
