
package eight1.interfejs;

public class Dog implements FoodEater, NoiseMaker{

    @Override
    public void eat() {
        System.out.println("Jedem hranu zato sto sam pas ");
    }

    @Override
    public String makeNoise() {
        return "AW AW AW";
    }
    
}
