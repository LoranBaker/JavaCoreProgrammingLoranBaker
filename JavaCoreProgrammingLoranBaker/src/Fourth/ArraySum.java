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
public class ArraySum {
    public static void main(String[] args) {
        int[] array = {21, 33 , 444, 311, 333, 111};
        int sum = 0;
        for (int i : array)
            sum +=i;
        System.out.println("The sum is " + sum);
    }
}
