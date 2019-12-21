/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC
 */
public class NineExecutor {
    public static void main(String[] args) {
        List <String> listOfNames = new ArrayList<>();
        listOfNames.add("A");
        listOfNames.add("B");
        listOfNames.add("C");
        listOfNames.add("D");
        listOfNames.add("E");
        listOfNames.add("F");
        listOfNames.add("G");
        System.out.println(listOfNames.get(2));
        printCollection(listOfNames);
    }
    static void printCollection(Collection<String> names){
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            String next = namesIterator.next();
            System.out.println(next);
        }
    }
}
