/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class User {

    public static void main(String[] args) {
        int Regular = 1;
        int Admin = 2;
        int SuperAdmin = 4;
        System.out.println("Unesi broj: ");
        Scanner scanner = new Scanner(System.in);
        int unesiBroj = scanner.nextInt();
        System.out.println("User level is " + unesiBroj);
        if (unesiBroj == Regular) {
            System.out.println("Regular user level: true");
        }else{
            System.out.println("Regular user level: false");
        }
        if (unesiBroj == Admin) {
            System.out.println("Admin user level: true");
        }else{ System.out.println("Admin user level: false"); 
        }
        if (unesiBroj == SuperAdmin) {
            System.out.println("Super Admin user level; true");
        }else{ System.out.println("Super Admin user level: false");
        }
    }
}
