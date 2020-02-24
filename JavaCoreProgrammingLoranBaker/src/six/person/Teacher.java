
package six.person;

import six.Person;

public class Teacher extends Person {
    private double salary;

    public Teacher(String ime, String prezime, double plata) {
        super(ime, prezime);
        this.salary=plata;
    }

    public double getSalary() {
        return salary;
    }
    }

    
