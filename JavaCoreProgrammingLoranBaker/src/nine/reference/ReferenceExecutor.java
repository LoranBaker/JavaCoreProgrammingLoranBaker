/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 *
 * @author PC
 */
public class ReferenceExecutor {
    public static void main(String[] args) {
        Person p1 = new Person();// strong referenca
         p1.setName("Loran");
        System.out.println(p1);
        WeakReference<Person> weakReferenceOfp1 = new WeakReference<>(p1);//weak referenca
        System.out.println(weakReferenceOfp1.get());
        System.gc();
        System.out.println(weakReferenceOfp1.get());
        SoftReference<Person> softReference = new SoftReference<>(p1);
    }
}
