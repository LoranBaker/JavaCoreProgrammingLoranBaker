package Fourth.loops.branching;

import java.util.Scanner;

public class BreakWithLabelDemo {

    public static void main(String[] args) {
        System.out.println("Unesi neki broj: ");
        int searchFor = new Scanner(System.in).nextInt();
        int[][] numbers = {
            {32, 54, 75, 87},
            {43, 66, 34, 11, 233},
            {11, 55, 67, 85, 552, 121}
        };
        boolean nasao = false;
        withLabel:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int vrijednost = numbers[i][j];
                System.out.print(vrijednost + "   ");
                if(searchFor==vrijednost){
                    break withLabel;
                }
                
            }
            System.out.println();
        }
            
    }
}

