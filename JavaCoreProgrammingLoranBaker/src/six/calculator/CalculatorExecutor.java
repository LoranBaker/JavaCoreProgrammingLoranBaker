
package six.calculator;

public class CalculatorExecutor {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(21.33, 66.44);
        double result = calculator.add();
        double result1 = calculator.sub();
        double result2 = calculator.div();
        double result3= calculator.mul();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        
    }
    
}
