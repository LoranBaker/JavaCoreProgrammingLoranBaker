
package seven.shape;


public abstract class Shape {
    private int x;
    private int y;
    private String boja;
    private String naziv;

    public Shape(int x, int y, String boja, String naziv) {
        this.x = x;
        this.y = y;
        this.boja = boja;
        this.naziv = naziv;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getBoja() {
        return boja;
    }

    public String getNaziv() {
        return naziv;
    }
    
    public abstract double calculateArea();
    
}
