
package six;

public class Person {
    private static int counter = 0;
    protected int age;
    String name;
    protected String surname;
    
    public Person(String ime, String prezime){
        this.name = ime;
        this.surname = prezime;
        counter++;
    }
    
    //non static function
    public void printPerson(){
        System.out.println("Ime: " + name + " Prezime: " + surname);
    }
    //static function
    public static void printCounter(){
        System.out.println("Broj objekata tipa Person = " + counter);
    }
}