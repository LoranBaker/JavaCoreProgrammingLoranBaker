
package eight1;

import eight1.enumeration.Day;
import eight1.enumeration.Gender;
import eight1.enumeration.Person;
import eight1.enumeration.Season;

public class EightExecutor1 {
    public static void main(String[] args) {
        Day day = new Day(Season.WINTER);
        Day day1 = new Day(Season.FALL);
        System.out.println(day.getSeason().getName());
        System.out.println(day1.getSeason().getName());
        printGender(Gender.MALE);
        printGender(Gender.FEMALE);
        printGender(Gender.TRANS);
        
    }
        static void printGender(Gender gender){
            switch(gender){
                case MALE:
                    System.out.println("Ja sam musko");
                    break;
                case FEMALE:
                    System.out.println("Ja sam zensko");
                    break;
                case TRANS:
                    System.out.println("Ne znam sta sam ");
                    break;
                default:
                    System.out.println("Unkown gender");
            }
        }
}
