
package seven;

public class Person {
    private static int counter = 0;
    private String name;
    private String surname;
    private int age;
    
    public Person(String name, String surname){
        this.name= name;
        this.surname=surname;
        counter++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public static void printCounter(){
        System.out.println("Counter = " + counter);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
    
}
