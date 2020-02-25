
package seven.shape;

public class Circle extends Shape{
    public static final double PI = 3.14;
    private double r;
    public Circle(int x, int y, String boja, String naziv, double r) {
        super(x, y, boja, naziv);
        this.r=r;
    }

    @Override
    public double calculateArea() {
        double area = r*r*PI;
        return area;
    }

    
    }
    

