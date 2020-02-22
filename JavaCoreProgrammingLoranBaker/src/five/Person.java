
package five;

import java.time.LocalDate;

public class Person {
    public int age;
    public String name;
    public String surname;
    public LocalDate birthday;
    
    //konstruktor ima isto ime kao i klasa- prije imena klase vidimo modifikator vidljivosti
    //konsktrukot moze imati sva cetri modifikatora vidljivosti
    //moze biti sa parametrima i bez parametara isto tako moze imati vise parametara
    public Person(String param1){
        this.name = param1;
    
    }
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        
    
    }
    public Person(String name, int age){
        this.name = name;
        this.age=age;
    
    }
    public void ubaciStarost(int param){
        System.out.println("Ubacujem starost");
        this.age = param;
    }
    public void print(){
        System.out.println("Ime: " + name + " Surname" + surname);
    }
}
