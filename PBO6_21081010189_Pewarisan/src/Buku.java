/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Buku extends Koleksi{
    public String penulis;
    
    Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    
    public void toStringBuku(){
        System.out.println("Judul: "+this.judul);
        System.out.println("Penulis: "+this.penulis);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Tahun: "+this.tahun);
    }
}
