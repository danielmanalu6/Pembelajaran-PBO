/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class Skripsi extends Buku {
    public String NPM;
    
    Skripsi(String NPM, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    public void toStringSkripsi(){
        System.out.println("NPM: "+this.NPM);
        System.out.println("Penulis: "+this.penulis);
        System.out.println("Judul: "+this.judul);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Tahun: "+this.tahun);
    }
}
