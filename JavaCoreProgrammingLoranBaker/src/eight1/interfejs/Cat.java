/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight1.interfejs;

/**
 *
 * @author PC
 */
public class Cat implements FoodEater, NoiseMaker{

    @Override
    public void eat() {
        System.out.println("Jedem hranu zato sto sam ja macka");
    }

    @Override
    public String makeNoise() {
        return "Mjau maju";
    }
    
}
