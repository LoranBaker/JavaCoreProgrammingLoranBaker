/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * PI;
        
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
