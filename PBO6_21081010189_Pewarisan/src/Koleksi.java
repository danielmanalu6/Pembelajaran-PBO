/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
class Koleksi {
    public String judul;
    public String penerbit;
    public int tahun; 
    Koleksi(String judul, String penerbit, int tahun){
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahun=tahun;
    }
    public static void main(String[] args) {
        //TODO code application logic here
        //bagian Koleksi
        System.out.println("\n************************************");
        Koleksi k = new Koleksi(
                "Ini Bagian Judul Koleksi",
                "Ini Bagian Penerbit Koleksi",
                1);
        k.toStringKoleksi();
        
        //bagian Buku
        System.out.println("\n************************************");
        Buku b = new Buku("Ini Bagian Judul Buku",
                "Ini Bagian Penulis Buku",
                "Ini Bagian Penerbit Buku",
                2);
        b.toStringBuku();
        
        //bagian Majalah
        System.out.println("\n************************************");
        Majalah m = new Majalah("Ini Bagian Judul Majalah",
                "Ini Bagian Edisi Majalah",
                "Ini Bagian Penerbit Majalah",
                3);
        m.toStringMajalah();
        
        //bagian Skripsi
        System.out.println("\n************************************");
        Skripsi s = new Skripsi("Ini Bagian NPM Skripsi",
                "Ini Bagian Judul Skripsi",
                "Ini Bagian Penulis Skripsi",
                "Ini Bagian Penerbit Skripsi",
                4);
        s.toStringSkripsi();
        
    }
    
    public void toStringKoleksi(){
        System.out.println("Judul: "+this.judul);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Tahun: "+this.tahun);
    }
}

