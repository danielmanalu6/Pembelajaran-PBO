/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Rectangle {
    public int Width = 2, Height = 4;
    ;
    public int CalculateArea(){
        System.out.println("Dengan Lebar "+ Width + " dan Panjang "+ Height ); 
        //System.out.println(" Dan Panjang "+Height);
        return this.Width * this.Height;
        //System.out.println("Luas Rectangle : " +CalculateArea);
    }
    public int CalculatePerimeter(){ 
        return (2 * Width) + (2 *Height) ;
        //System.out.println("Keliling Square : "+CalculatePerimeter);
    }
}
