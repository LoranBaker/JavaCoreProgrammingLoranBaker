
package eight1.interfejs;

public class AnimalExecutor {
    public static void main(String[] args) {
        Dog dog = new Dog();
        makeNoise(dog);
        eatFood(dog);
        dogExecutor(dog);
        Cat cat = new Cat();
        makeNoise(cat);
        eatFood(cat);
    }
    static void dogExecutor(Dog dog){
        System.out.println("Ja sam pas koji laje");
    }
    static void makeNoise(NoiseMaker noiseMaker){
        System.out.println("Noise maker making noise : " + noiseMaker.makeNoise());
        
    }
    static void eatFood(FoodEater foodEater){
        System.out.println("Food Eater eating food ");
        foodEater.eat();
    }
}
