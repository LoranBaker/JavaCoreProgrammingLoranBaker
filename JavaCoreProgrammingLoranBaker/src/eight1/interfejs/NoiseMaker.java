
package eight1.interfejs;

public interface NoiseMaker {
    public static final String name = "Making nose";
    //public abstract se podrazumijeva
    String makeNoise();
    
    default void printNoise(){
        System.out.println("Noise printing " + makeNoise());
    }
    //moze imati i public static void funkicije
    public static void something(){
    
    }
}
