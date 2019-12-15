/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.inferfaces;

/**
 *
 * @author PC
 */
public class CollectionExecutor {
    public static void main(String[] args) {
        double [] numbers = new double[3];
        numbers[0] = 23.1;
        for (double number : numbers){
            System.out.println(number);
        }
      
    }
}
