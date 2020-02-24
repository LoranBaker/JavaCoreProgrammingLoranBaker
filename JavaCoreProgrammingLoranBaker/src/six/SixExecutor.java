
package six;

public class SixExecutor {
    public static void main(String[] args) {
        Person p1 = new Person("Loran,", "Baker");
        Person p2 = new Person("Faruk,", "Topuz");
        Person.printCounter();
        p1.printPerson();
        p2.printPerson();
        p1.printPerson();
    }
            
}
