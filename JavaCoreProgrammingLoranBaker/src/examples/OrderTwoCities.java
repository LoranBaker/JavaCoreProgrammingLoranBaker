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
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();
        if (city1.compareTo(city2)<0)
        System.out.println("the cities in alphabetical order are " + city1 + " " + city2);
        else
        System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
                
                
        }
                        
    }

            
       
   
