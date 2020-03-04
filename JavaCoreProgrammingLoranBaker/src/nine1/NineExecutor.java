
package nine1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NineExecutor {
    public static void main(String[] args) {
        System.out.println("ARRAY LIST");
        List<String> listOfCity = new ArrayList<>();
        listOfCity.add("Gorazde");
        listOfCity.add("Sarajevo");
        listOfCity.add("Sarajevo");
        listOfCity.add("Tuzla");
        listOfCity.add("Tuzla");
        listOfCity.add("Zenica");
        System.out.println(listOfCity.get(2));
        printCollection(listOfCity);
        System.out.println("LINKED LISTA");
        List<String> listOfCity1 = new LinkedList<>();
        listOfCity1.add("Gorazde");
        listOfCity1.add("Sarajevo");
        listOfCity1.add("Sarajevo");
        listOfCity1.add("Tuzla");
        listOfCity1.add("Tuzla");
        listOfCity1.add("Zenica");
        System.out.println(listOfCity1.get(2));
        printCollection(listOfCity1);
        System.out.println("SET HAShSET");
        Set<String> listOfCity2 = new HashSet<>();
        listOfCity2.add("Gorazde");
        listOfCity2.add("Sarajevo");
        listOfCity2.add("Sarajevo");
        listOfCity2.add("Tuzla");
        listOfCity2.add("Tuzla");
        listOfCity2.add("Zenica");
        printCollection(listOfCity2);
        System.out.println("LinkedHashSET");
        Set<String> listOfCity3 = new LinkedHashSet<>();
        listOfCity3.add("Gorazde");
        listOfCity3.add("Sarajevo");
        listOfCity3.add("Sarajevo");
        listOfCity3.add("Tuzla");
        listOfCity3.add("Tuzla");
        listOfCity3.add("Zenica");
        printCollection(listOfCity3);
        System.out.println("TREE SET");
        Set<String> listOfCity4 = new TreeSet<>();
        listOfCity4.add("Gorazde");
        listOfCity4.add("Sarajevo");
        listOfCity4.add("Sarajevo");
        listOfCity4.add("Tuzla");
        listOfCity4.add("Tuzla");
        listOfCity4.add("Zenica");
        printCollection(listOfCity4);
    }
       static void printCollection(Collection<String> city){
        Iterator<String> cityIterator = city.iterator();
        while(cityIterator.hasNext()){
            String next = cityIterator.next();
            System.out.println(next);
      
        }
       }
}
