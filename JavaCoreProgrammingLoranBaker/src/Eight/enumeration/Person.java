/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.enumeration;

/**
 *
 * @author PC
 */
public class Person {
    private String name;
    private String surname;
    private Gender gender;
    public Person (String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
    
}
