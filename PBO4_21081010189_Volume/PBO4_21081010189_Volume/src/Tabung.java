/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Tabung {
    //atributs
    public double radius, tinggi, volume;
    public double pi=3.14;
    
    //constructor tanpa parameter
    public Tabung(){
        System.out.println("Rumus Volume Tabung = pi * Radius * Radius * Tinggi");
    }
    //constructor2 dengan parameter
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.pi * this.radius * this.radius * this.tinggi;
    }
    public double GetVolume(){
        return this.volume;
    }
}
