/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Ellipse {
    public double SemiMajorAxis = 8, SemiMinorAxis = 5;
    ;
    public double CalculateArea(){
        System.out.println("Dengan Panjang AC "+SemiMajorAxis+ " dan Panjang BD "+SemiMinorAxis);
        return this.SemiMajorAxis * this.SemiMinorAxis * 3.14;
        //System.out.println("Luas Rectangle : " +CalculateArea);
    }
    public double CalculatePerimeter(){ 
        return (this.SemiMajorAxis + this.SemiMinorAxis) * 3.14;
        //System.out.println("Keliling Square : "+CalculatePerimeter);
   }
}
