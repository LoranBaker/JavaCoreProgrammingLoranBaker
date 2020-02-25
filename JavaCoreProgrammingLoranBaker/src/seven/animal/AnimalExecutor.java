
package seven.animal;

import seven.animal.Animal;
import seven.animal.Dog;

public class AnimalExecutor {
    public static void main(String[] args) {
        Dog dog = new Dog();
        simulirajKretanjeZivotinje(dog);
        Bird bird = new Bird();
        simulirajKretanjeZivotinje(bird);
    }
    
    static void simulirajKretanjeZivotinje(Animal animal){
        animal.kreciSe();
    }
}
