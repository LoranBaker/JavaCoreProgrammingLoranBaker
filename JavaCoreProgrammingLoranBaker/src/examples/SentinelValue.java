package examples;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        //Keep reading data until the input is 0
        int count = 0;
        while (count < 1){
            System.out.println("Welcome to Java!");
            count++;
        }
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int data = 0;
        
        while (data != 0){
            sum += data;
            
            System.out.println("Enter an integer(the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
