package Three;

public class ShiftBitOperator {
    public static void main(String[] args) {
        int a = -10;
        int result = a>>1;//signed shift right;
        System.out.println(result);
        int result1 = a>>>1;//unsigned shift;ne cuva predznak;
        System.out.println(result1);
        int result2 = a<<1;//unsigned shift left;
        System.out.println(result2);
    }
}
