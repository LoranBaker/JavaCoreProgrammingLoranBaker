package examples;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        double pi = 3.14159;
        
        radius = 20;
        
        area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
