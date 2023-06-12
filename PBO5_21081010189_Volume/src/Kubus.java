/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Daniel Manalu
 */
public class Kubus {
    //atributs
    public int sisi,volume;
    
    //constructor tanpa parameter
    public Kubus(){
        System.out.println("Rumus Volume Kubus = Sisi * Sisi * Sisi");
    }
    //constructor2 dengan parameter
    public Kubus(int sisi){
        this.sisi = sisi;
    }
    public void SetSisi(int sisi){
        this.sisi = sisi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.sisi * this.sisi * this.sisi;
    }
    public int GetVolume(){
        return this.volume;
    }
}
