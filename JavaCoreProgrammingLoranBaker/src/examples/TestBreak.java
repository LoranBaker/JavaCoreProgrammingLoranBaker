package examples;

import java.util.Scanner;

public class TestBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        while (number < 20 ){
            number++;
            sum+=number;
            if(sum>=100)
                break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
