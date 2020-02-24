package six.calculator;

public class Calculator {

    public double operand1;
    public double operand2;

    public Calculator(double v1, double v2) {
        this.operand1 = v1;
        this.operand2 = v2;
    }

    public double add() {
        double result = operand1 + operand2;
        return result;
    }

    public double sub() {
        double result = operand1 - operand2;
        return result;
    }

    public double mul() {
        double result = operand1 * operand2;
        return result;
    }

    public double div() {
        double result = operand1 / operand2;
        return result;
    }
}
