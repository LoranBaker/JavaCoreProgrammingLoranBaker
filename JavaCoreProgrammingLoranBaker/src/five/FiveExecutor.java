package five;

public class FiveExecutor {
    public static void main(String[] args) {
        Person p1 = new Person("Loran");
        p1.age = 21;
        p1.name= "Loran";
        p1.surname = "Baker";
        Person person = new Person("Loran", "Baker");
        person.ubaciStarost(21);
        Person person1 = new Person("Loran", 21);
        System.out.println(person);
        System.out.println(person1);
    }
}
