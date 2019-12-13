/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight;

import Eight.enumeration.Day;
import Eight.enumeration.Gender;
import Eight.enumeration.Season;

/**
 *
 * @author PC
 */
public class EightExecutor {

    public static void main(String[] args) {
        Day day = new Day(Season.FALL);
        Day day1 = new Day(Season.SPRING);
        System.out.println(day.getSeason().getName());
        printGender(Gender.MALE);
        printGender(Gender.FAMALE);
        printGender(Gender.TRANS);

    }

    static void printGender(Gender gender) {
        switch (gender) {
            case MALE:
                System.out.println("Ja sam muskarcina");
                break;
            case FAMALE:
                System.out.println("I am a lady");
                break;
            case TRANS:
                System.out.println("Ne znam sta sam");
                break;
            default:
                System.out.println("Unknown gen");
        }
    }
}
