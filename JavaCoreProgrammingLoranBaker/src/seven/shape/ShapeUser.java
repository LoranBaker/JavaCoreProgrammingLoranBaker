/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven.shape;

/**
 *
 * @author PC
 */
public class ShapeUser {
    public static void main(String[] args) {
       Shape object1 = new Circle(0, 0, "Circle,", "kruzic", 2);
       double result = object1.calculateArea();
       Shape object2 = new Reactangle(0, 0, "Crna","pravougaonik", 2, 3);
       result= object2.calculateArea();
       Shape object3 = new Square(0, 0, "Zelena ", "Square", 4);
       printShape(object1, object2, object3);
    }
    static void printShape(Shape...shapes){
       for(Shape shape: shapes){
           printShapeArea(shape);
       }
       
    }
    
    static void printShapeArea(Shape shape){
        System.out.println("Shape: " + shape.getNaziv() +" =" + shape.calculateArea());    }
}
