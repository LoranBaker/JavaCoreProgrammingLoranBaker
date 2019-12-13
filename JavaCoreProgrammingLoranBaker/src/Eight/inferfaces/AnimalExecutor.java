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
public class AnimalExecutor {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        makeNoise((NoiseMaker) dog);
        eatFood((FoodEater) dog);
        makeNoise((NoiseMaker) cat);
        eatFood((FoodEater) cat);
        dogExecutor(dog);
    }
    static void dogExecutor(Dog dog){
        System.out.println("Ja sam pas i ponosan sam");
    }
    
    static void makeNoise(NoiseMaker noiseMaker){
        System.out.println("Noise maker making noise: " + noiseMaker.makeNoise());
        
    }
     static void eatFood(FoodEater foodEater){
        System.out.println("Noise maker making noise: ");
        foodEater.eat();
        
    }
}
