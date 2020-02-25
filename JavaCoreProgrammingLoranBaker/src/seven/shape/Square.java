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
public class Square extends Shape{
    
    private double a;
    
    public Square(int x, int y, String boja, String naziv,double a) {
        super(x, y, boja, naziv);
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }
    
}
