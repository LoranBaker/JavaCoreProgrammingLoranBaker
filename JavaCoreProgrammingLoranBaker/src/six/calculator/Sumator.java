
package six.calculator;

public class Sumator {
    public int add(int a, int b){
        int result = a+b;
        return result;
    }
    
    public double add(double a, double b){
        double result = a+b;
        return result;
    }
    public int add(int a1, int a2, int a3){
        int result = a1+a2+a3;
        return result;
    }
    //params kreira niz integer brojeva, sa parametirma i bez parametara
    public int add(int...params){
        int sum = 0;
        for(int param: params){
            sum = sum +param;
        }
        return sum;
    }
}
