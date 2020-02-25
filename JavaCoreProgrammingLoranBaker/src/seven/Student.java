/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

/**
 *
 * @author PC
 */
public class Student extends Person{
    private int indexNumber;

    public Student(String name, String surname, int indexNumber) {
        super(name, surname);
        this.indexNumber=indexNumber;
        System.out.println("Student created :p");
    }

    public int getIndexNumber() {
        return indexNumber;
    }

 
    
}
