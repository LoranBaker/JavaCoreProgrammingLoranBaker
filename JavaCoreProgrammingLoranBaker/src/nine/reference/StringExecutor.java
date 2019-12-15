/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.reference;

/**
 *
 * @author PC
 */
public class StringExecutor {
    public static void main(String[] args) {
        String name = new String("Amar");
        String name1 = new String ("Marko").intern();
        String name2 = "Marko";
        System.out.println(name1.equals(name2));
        String names = "Ferida; Kanita; Rijad Fadil";
        //split(String regex)
        String [] niz = names.split("; ");
        for(int i = 0; i<niz.length; i++){
            String vrijednost = niz[i];
            System.out.print(vrijednost + ", ");
        }
    }
}
