
package seven.shape;

public class Reactangle extends Shape {
    private double a, b;
    public Reactangle(int x, int y, String boja, String naziv, double a , double b) {
        super(x, y, boja, naziv);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
    
}
