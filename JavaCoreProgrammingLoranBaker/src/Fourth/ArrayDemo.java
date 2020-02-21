package Fourth;

public class ArrayDemo {
    public static void main(String[] args) {
        //1. nacin da kreiramo niz
        int[] numbers = new int [3];//prvo zauzima prostor od 3 x 32bita
        numbers[0] = 23;
        numbers[1] = 31;
        numbers[2] = 30;
        //2. nacin da kreiramo niz
        int [] brojevi = {23, 31, 30};
        System.out.println(numbers[1]);
        System.out.println(brojevi[2]);
    }
}
