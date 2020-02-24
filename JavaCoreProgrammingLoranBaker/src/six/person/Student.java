/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six.person;

import six.Person;

/**
 *
 * @author PC
 */
public class Student extends Person{
    private int studentNumber;

    public Student(String ime, String prezime, int brojIndexa) {
        super(ime, prezime);
        this.studentNumber=brojIndexa;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    
    
}
