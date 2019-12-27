package examples;

public class MultiplcationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.println("      ");
        for (int j = 1; j<=9;j++)
        System.out.println("     " + j);
        System.out.println("------------------------");
        
        for (int i = 1; i <= 9; i++){
            System.out.println(i + " I ");
            for(int j = 1; j<=9; j++){
            System.out.println("%4d" + i * j);
            }
            System.out.println();
        }
    }
}
