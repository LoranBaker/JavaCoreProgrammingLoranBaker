/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;


public class Teacher extends Person {
    private double salary;
    public Teacher(String name, String surname, double salary){
        super(name, surname);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
    
    
    
}
