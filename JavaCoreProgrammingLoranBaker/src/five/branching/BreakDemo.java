
package five.branching;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int [] numbers = {12, 35, 33, 54 ,642, 112, 233, 44};
        System.out.println("Unesi broj: ");
        int userNumber = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        label:
        for(int i=0;i<numbers.length; i++){
           int vrijednost = numbers[i];
           if(userNumber==vrijednost){
               foundIt = true;
               break;
           }
           }
        System.out.println(foundIt ? "Postoji broj koji ste unijeli u niz!":"Ne postoji ovaj broj");
        }
    }

