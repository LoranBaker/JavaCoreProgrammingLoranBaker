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
public class Cat implements NoiseMaker {
    
    public String makeNoise(){
        return "MJAU MJAU";
    }
    public void eat(){
        System.out.println("Jedem hranu jer sam maca.");
    }
    
}
