/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.inferfaces;

/**
 *
 * @author PC
 */
public class Box<T> {
    private T properties;
    
    public Box(T properties){
        this.properties = properties;
    }
    public T getProperties(){
        return properties;
    }
}
