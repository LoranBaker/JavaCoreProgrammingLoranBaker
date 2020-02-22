
package five.branching;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int [][] numbers = {
            {12, 35, 33, 54 },
            {12, 34, 565, 33,11},
            {43, 11, 34, 566, 77, 43}
        };
        System.out.println("Unesi broj: ");
        int korisnickiUnos = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        label:
        for(int i = 0;i<numbers.length;i++){
            int[] vrijednost = numbers[i];
            for(int j = 0;j<numbers.length; j++){
            int vrijednostNiza = vrijednost[j];
            if(vrijednostNiza==korisnickiUnos){
                foundIt = true;
                break label;
            }
        }
        }
        System.out.println(foundIt ? "Postoji broj u nizu" : "Ne postoji broj u nizu");
    }
    
}
