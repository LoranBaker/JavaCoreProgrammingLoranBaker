/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author PC
 */
public class CollectionExecutor {
    public static void main(String[] args) {
        String names = "Amar Hodzic;Rijad Dautovic;Rijad Rogo";
   
        String [] arrayOfNames = names.split (";");
        for(String name : arrayOfNames){
            System.out.println(name);
        }
        //arrayOfNames[4] = "Marko Nikolic";
        
        Collection<String> iterableObject = new ArrayList<>();
        for(String name : arrayOfNames){
            iterableObject.add(name);
        }
        for(String name: iterableObject){
            System.out.println(name);
        }
        List<Integer> listOfNumbers = new ArrayList<>();
    }
}
