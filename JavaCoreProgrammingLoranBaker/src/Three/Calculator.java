/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double operand1 = input.nextDouble();
        double operand2 = input.nextDouble();
        double add = operand1 + operand2;
        System.out.println("The Addition of two numbers is " + add );
        double sub = operand1 - operand2;
        System.out.println("The Substraction of two numbers is: " + sub);
        double mul = operand1*operand2;
        System.out.println("The multiplication of two numbers is: " + mul);
        double div = operand1/operand2;
        System.out.println("The division of two numbers is:" + div);
    }
}
