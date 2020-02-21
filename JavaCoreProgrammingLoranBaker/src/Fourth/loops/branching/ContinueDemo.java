package Fourth.loops.branching;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neku recenicu: ");
        String recenica = new Scanner(System.in).nextLine();
        char[] nizKaraktera = recenica.toCharArray();
        char searchForChar = 'p';
        
        int counterP = 0;
        for(char c: nizKaraktera){
            if (c!=searchForChar){
                continue;
            }
            counterP++;
        }
        System.out.println("Slovo 'p' se pojavljuje " + counterP + " puta u recenici ");
    }
}
