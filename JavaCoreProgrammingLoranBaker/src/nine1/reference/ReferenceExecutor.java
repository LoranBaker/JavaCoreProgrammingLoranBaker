package nine1.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExecutor {
    public static void main(String[] args) {
        Person p = new Person(); 
        p.setName("Loran");
        System.out.println(p.toString());
 
        WeakReference<Person> p2 = new WeakReference<>(p);
        System.out.println(p2.get());
        System.gc();
        System.out.println(p2.get());
        
        SoftReference<Person> softReference = new SoftReference<>(p);
        
    }
}
