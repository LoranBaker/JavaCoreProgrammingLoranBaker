/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.inferfaces;

import Eight.enumeration.Gender;
import Eight.enumeration.Person;

/**
 *
 * @author PC
 */
public class BoxOtvarac {
    public static void main(String[] args) {
        Box<String> kutija = new Box<>("Moj text koji opisuje kutiju");
        Box<Double> macinaKutija = new Box<>(232.12);
        Box<Person> mojaaKutija = new Box<>(new Person("Loran ", "Baker", Gender.MALE));
        
        String kutija1 = kutija.getProperties();
        Double maca = macinaKutija.getProperties();
    }
}
