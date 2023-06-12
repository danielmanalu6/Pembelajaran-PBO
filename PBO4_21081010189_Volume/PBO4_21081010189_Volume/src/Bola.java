/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Bola {
    //atributs
    public double radius, volume;
    public double pi=3.14;
    
    //constructor1 tanpa parameter
    public Bola(){
        System.out.println("Rumus Volume Bola = 4/3 * pi * Radius * Radius * Radius ");
    }
    //constructor dengan parameter
    public Bola(double radius){
        this.radius = radius;
    }    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public void ComputeAndSetVolume(){
        this.volume = 1.33 * this.pi * this.radius * this.radius * this.radius;
    }
    public double GetVolume(){
        return this.volume;
    }
}
