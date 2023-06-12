/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */

public class HitungLuasKeliling {
    public static void main(String[] args) {
        
        Square persegi = new Square();
        System.out.println("Luas Persegi Adalah "+persegi.CalculateArea());
        System.out.println("Keliling Persegi Adalah " +persegi.CalculatePerimeter());
        System.out.println("");
        
        Rectangle persegipanjang = new Rectangle();
        System.out.println("Luas Persegi Panjang Adalah "+persegipanjang.CalculateArea());
        System.out.println("Keliling Persegi Panjang Adalah " + persegipanjang.CalculatePerimeter());
        System.out.println("");
        
        Circle lingkaran = new Circle();
        System.out.println("Luas Lingkaran Adalah "+lingkaran.CalculateArea());
        System.out.println("Keliling Lingkaran Adalah " + lingkaran.CalculatePerimeter());
        System.out.println("");
        
        Ellipse elips = new Ellipse();
        System.out.println("Luas Elips Adalah "+elips.CalculateArea());
        System.out.println("Keliling Elips Adalah " + elips.CalculatePerimeter());
        System.out.println("");
    }
}
