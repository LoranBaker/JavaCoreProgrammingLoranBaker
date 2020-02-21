package Fourth.loops.branching;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int[] numbers ={212, 323, 444, 11, 1, 55, ',', 2};
        int searchFor = new Scanner(System.in).nextInt();
        int i;
        boolean pronadjen = false;
        for(i = 0; i<numbers.length; i++){
            int mutant = numbers[i];
            if(mutant == searchFor){
                pronadjen = true;
                break;
            
            }
            System.out.println(mutant);
        }
        if(pronadjen){
            System.out.println("pronadjen "+ searchFor + " na indeksu " + i);
        }else{
            System.out.println("Nema tog broja " + searchFor);
        }
    }
    
}
