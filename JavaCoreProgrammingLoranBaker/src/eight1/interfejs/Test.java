
package eight1.interfejs;



public class Test {
    public static void main(String[] args) {
        FunInterface object = (int x)->System.out.println(2*x);
        
        object.abstractFun(5);
    }
}
