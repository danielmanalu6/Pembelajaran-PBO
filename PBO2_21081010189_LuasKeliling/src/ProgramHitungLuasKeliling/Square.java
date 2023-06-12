/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */

public class Square {
    public int LengthOfSide = 8;
    public int CalculateArea(){
        System.out.println("Dengan Panjang Sisi Persegi " +LengthOfSide);
        return this.LengthOfSide * this.LengthOfSide;
    }
    public int CalculatePerimeter(){ 
        int Perimeter;
        Perimeter = this.LengthOfSide*4;
        return Perimeter;
    }
}
