/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight1.interfejs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExecutor {
    public static void main(String[] args) {   
    double[] doubleNumbers = new double[3];
    doubleNumbers[0] = 43.3; 
    doubleNumbers[1] = 34.32;
    doubleNumbers[2] = 12.3;
    for(double numbers: doubleNumbers)
    {
        System.out.println(numbers);
    }

    Collection<Double> collectionofNumbers = new ArrayList<>();
    collectionofNumbers.add(34.3);
    collectionofNumbers.add(35.32);
    collectionofNumbers.add(11.33);
    
    Iterator<Double> iterator = collectionofNumbers.iterator();
    while(iterator.hasNext()){
        Double element = iterator.next();
        if(element == 34.3){
            collectionofNumbers.remove(element);
        }
        System.out.println(element);
    }
    
    for(Double element: collectionofNumbers)
    {
        System.out.println(element);
    }
}
}