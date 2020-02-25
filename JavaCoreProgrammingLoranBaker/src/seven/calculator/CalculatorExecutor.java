
package seven.calculator;

import seven.calculator.Calculator;


public class CalculatorExecutor {
    public static void main(String[] args) {   
    Calculator calculator = new Calculator(12.53, 53.33);
    double result = calculator.add();
    result = calculator.sub();
    result = calculator.div();
    result = calculator.mul();
        System.out.println(result);
}
}