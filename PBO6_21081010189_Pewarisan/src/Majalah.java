/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Majalah extends Koleksi{
    public String edisi;
    Majalah(String judul, String edisi, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public void toStringMajalah(){
        System.out.println("Judul: "+this.judul);
        System.out.println("Edisi: "+this.edisi);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Tahun: "+this.tahun);
    }
}
