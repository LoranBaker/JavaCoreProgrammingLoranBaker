
package nine1.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionExectuor {

    public static void main(String[] args) {
        String names = "Gorazde;Sarajevo;Travnik;Mostar";
        String[] arrayOfNames = names.split(";");

        for (String name : arrayOfNames) {
            System.out.println(name);
        }
        System.out.println(" ");
      
        Collection<String> iterableCity = new ArrayList<>();
        
        Iterator<String> iterator = iterableCity.iterator();
        System.out.println(iterator);
        /*
        for (String name : arrayOfNames) {
            iterableCity.add(name);
        }
        for (String name : iterableCity) {
            System.out.println(name);
        }*/
            /*
            static void printCollection(Collection<String> collectionOfString){
            for(String stringElement: collectionOfString){
                System.out.println(stringElement);   
        }*/
    }
}
