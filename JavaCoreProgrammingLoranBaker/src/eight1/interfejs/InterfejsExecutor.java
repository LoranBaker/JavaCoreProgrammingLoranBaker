
package eight1.interfejs;

import eight1.enumeration.Gender;
import eight1.enumeration.Person;

public class InterfejsExecutor {
    public static void main(String[] args) {
        NoiseMaker noiseMaker = new NoiseMaker(){

            @Override
            public String makeNoise() {
                return "Vidljiv samo unutar main funkcije(anonimni)"; 
            }     
        };
        //zamjena za od 6 do 12 linije
        //()-> lambda operator
        NoiseMaker noiseMaker1 = ()-> "Make noise";
        CheckPerson maleCheckPerson = new CheckPerson() {

            @Override
            public boolean check(Person person) {
                return person.getGender().equals(Gender.MALE);
            }
        };
        boolean result = maleCheckPerson.check(new Person("Loran", "Baker", Gender.MALE));
        System.out.println(result);
        CheckPerson femalePerson = (Person p) -> p.getGender().equals(Gender.FEMALE);
        System.out.println(femalePerson);
        String noise = noiseMaker.makeNoise();
        System.out.println(noise);
        
    }
}
