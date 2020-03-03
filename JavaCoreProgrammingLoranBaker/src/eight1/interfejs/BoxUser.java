
package eight1.interfejs;

import eight1.enumeration.Gender;
import eight1.enumeration.Person;

public class BoxUser {
    public static void main(String[] args) {
        Box<String> mojaKutija = new Box<>("Moja kutija");
        Box<Double> dobuleKutija = new Box<>(54.3);
        Box<Person> personKutija = new Box<>(new Person("Loran", "Baker", Gender.MALE));
        
        String mojaktuija1 = mojaKutija.getPolje();
        Double doublekutija = dobuleKutija.getPolje();
        System.out.println(mojaktuija1);
        System.out.println(doublekutija);
    }
}
