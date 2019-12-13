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
public class Dog implements FoodEater, NoiseMaker{

    @Override
    public void eat() {
        System.out.println("Jedem hranu jer sam pas.");
    }
    
    public String makeNoise(){
        return "WOW WOW" ;
    }
}
