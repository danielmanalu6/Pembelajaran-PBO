/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class LimaSegiEmpat {
    //atribut
    public double sisi,tinggi,volume;
    
    //constructor1 tanpa parameter
    public LimaSegiEmpat(){
        System.out.println("Rumus Volume LimaSegiEmpat = 1/3 * Luas Alas * Tinggi");
    }
    //constructor2 dengan parameter
    public LimaSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
    }
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    public void SetTinggi (double tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = 0.33 * this.sisi * this.sisi * this.tinggi;
    }
    public double GetVolume(){
        return this.volume;
    }
}