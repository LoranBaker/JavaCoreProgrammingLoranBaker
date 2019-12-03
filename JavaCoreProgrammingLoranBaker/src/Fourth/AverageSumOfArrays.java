/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourth;

/**
 *
 * @author PC
 */
public class AverageSumOfArrays {
    public static void main(String[] args) {
        int [] numbers = new int []{10, 20, 30, 40, 50, 60, 70, 80, 90,100};
        int sum = 0;
        for(int i=0;i < numbers.length;i++){
            sum = sum + numbers[i];
            double average = sum / numbers.length;
            System.out.println("Average vaule of the array elements is " + average);
        }
    }
}
