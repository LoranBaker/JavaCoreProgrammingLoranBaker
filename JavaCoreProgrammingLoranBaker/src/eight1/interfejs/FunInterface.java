/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight1.interfejs;

/**
 *
 * @author PC
 */
public interface FunInterface {
    
    void abstractFun(int x);
    
    default void normalFun(){
        System.out.println("Hello");
    }
}
