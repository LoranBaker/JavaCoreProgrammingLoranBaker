/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fourth.loops;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hugo {
    public static void main(String[] args) {
        System.out.println("Pritisni peticu zapocni igricu ");
        Scanner scanner = new Scanner(System.in);
        int unesiBroj = scanner.nextInt();
        int unesiBroj2;
        /*
        if(unesiBroj==5){
            System.out.println("Poceo si igricu");
        }else{
            System.out.println("Nisi poceo igricu");
        }*/
        do {
            System.out.println("pritisni peticu zapocni igricu ");
            unesiBroj2 = scanner.nextInt();
        }while(unesiBroj2!=5);
        System.out.println("Poceo si igricu");
}
}