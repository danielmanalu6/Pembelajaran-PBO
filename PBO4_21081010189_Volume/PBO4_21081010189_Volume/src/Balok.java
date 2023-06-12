/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Balok {
    //atributs
    public int panjang, lebar, tinggi, volume;
    
    //constructor tanpa parameter
    public Balok(){
        System.out.println("Rumus Volume Balok = Panjang * Lebar * Tinggi");
    }
    //constructor dengan parameter
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
    public int GetVolume(){
        return this.volume;
    }
}
