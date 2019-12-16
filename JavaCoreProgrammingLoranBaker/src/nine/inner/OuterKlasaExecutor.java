/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.inner;

/**
 *
 * @author PC
 */
public class OuterKlasaExecutor {
    public static void main(String[] args) {
    OuterKlasa.StaticNestedKlasa objekatStatickeKlase = new OuterKlasa.StaticNestedKlasa();
    OuterKlasa outerKlasaObjekat = new OuterKlasa();
    OuterKlasa.InnerKlasa innerClassObject = outerKlasaObjekat.new InnerKlasa();
  
    
    }
 
}
