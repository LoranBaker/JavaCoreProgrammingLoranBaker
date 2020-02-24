
package six.calculator;

public class SumatorExectuor {
    public static void main(String[] args) {
        Sumator sumator = new Sumator();
        int result = sumator.add(23, 45);
        double result1 = sumator.add(12.44, 33.12);
        System.out.println(result);
        System.out.println(result1);
        int result23 = sumator.add(1331, 444, 22, 3211, 3321);
        System.out.println(result23);
    }
}
