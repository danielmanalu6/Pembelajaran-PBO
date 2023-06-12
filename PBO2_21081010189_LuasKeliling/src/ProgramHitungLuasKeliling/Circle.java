/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Circle {
    public double Radius = 9;
    ;
    public double CalculateArea(){
        System.out.println("Dengan Besar Jari-jari "+Radius);
        return this.Radius * this.Radius * 3.14;
        //System.out.println("Luas Rectangle : " +CalculateArea);
    }
    public double CalculatePerimeter(){ 
        return (2 * 3.14 * this.Radius);
        //System.out.println("Keliling Square : "+CalculatePerimeter);
    }
}
