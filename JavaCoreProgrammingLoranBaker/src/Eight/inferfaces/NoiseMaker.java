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
public interface NoiseMaker {
    String name = "Make noise";
    String makeNoise();
    default void printNoise(){
        System.out.println("Noise printing: " + makeNoise());
    }
    public static void something(){
        
    }
}
