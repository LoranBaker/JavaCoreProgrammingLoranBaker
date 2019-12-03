/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourth;

import java.util.Arrays;

public class NumericArrayAndString {
    public static void main(String[] args) {
        int [] Array1 = {2132, 6424,  62121, 654, 2211, 588, 2142, 7755, 2124, 5544};
        String [] Array2 = {"Java", "C++", "Python", "JavaScript", "PHP"};
        System.out.println("Original numeric array: " + Arrays.toString(Array1));
        Arrays.sort(Array1);
        System.out.println("Sorted numeric array: " + Arrays.toString(Array1));
        System.out.println("Orginal string array: " + Arrays.toString(Array2));
        Arrays.sort(Array2);
        System.out.println("Sorted numeric array: " + Arrays.toString(Array2));
    }
}
