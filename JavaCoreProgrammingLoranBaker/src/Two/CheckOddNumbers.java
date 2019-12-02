/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CheckOddNumbers {
    public static void main(String[] args) {
    int num;
    System.out.println("Enter a number: ");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
        System.out.println("Entered variable is " + num);
    if(num%2==0){
        System.out.println("Variable is odd true");
    }else{
        System.out.println("Variable is even false");
    }
}
}