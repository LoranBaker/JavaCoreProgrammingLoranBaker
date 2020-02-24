
package six.calculator;

public class SwapTest {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        System.out.println("A = " + a + " B= " + b);
        swap (a,b);
        System.out.println("A = " + a + " B= " + b);
    }
    
    public static void swap(int a, int b){
        System.out.println("U funkciji A = " + a + " B= " + b);
        int temp = b;
        b=a;
        a=temp;
        System.out.println("U funkciji A = " + a + " B= " + b);
    }
}
