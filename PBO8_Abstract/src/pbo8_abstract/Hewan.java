/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo8_abstract;

/**
 *
 * @author Daniel Manalu
 */
public abstract class Hewan {
    //method abstrak 1 dan dan 1 tidak
    
    //method abstract
    public abstract void berbicara();
    public abstract void berjalan();
    
    //method biasa
    public void tidur(){
        System.out.println("Zzzzz.. Zzzzz..");
    }
    
    //method biasa
    public void makan(){
        System.out.println("Nyam.. Nyam..");
    }
    
}
