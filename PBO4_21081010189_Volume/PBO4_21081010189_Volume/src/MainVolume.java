/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Manalu
 */
public class MainVolume {
    public static void main(String[] args) {
        
        new Kubus();
        Kubus kotak = new Kubus(3);
        kotak.ComputeAndSetVolume();
        System.out.println("Kubus dengan sisi " + kotak.sisi+" Mendapatkan Volume "+ kotak.GetVolume());
        System.out.println("");
        
        new Balok();
        Balok balok = new Balok(5,7,4);
        balok.ComputeAndSetVolume();
        System.out.println("Balok dengan Panjang " + balok.panjang+", Lebar "+ balok.lebar + ", dan Tinggi " + balok.tinggi +" Mendapatkan Volume "+balok.GetVolume());
        System.out.println("");
        
        new Tabung();
        Tabung tabung = new Tabung(3.5,4);
        tabung.ComputeAndSetVolume();
        System.out.println("Tabung dengan Radius "+tabung.radius+" dan Tinggi "+tabung.tinggi+" Mendapatkan Volume "+tabung.GetVolume());
        System.out.println("");
        
        new LimaSegiEmpat();
        LimaSegiEmpat limas = new LimaSegiEmpat(2,4);
        limas.ComputeAndSetVolume();
        System.out.println("Limas dengan Sisi "+limas.sisi+" dan Tinggi "+limas.tinggi+" Mendapatkan Volume "+limas.GetVolume());
        System.out.println("");
        
        new Bola();
        Bola bola = new Bola(3.6);
        bola.ComputeAndSetVolume();
        System.out.println("Bola dengan Radius "+bola.radius+" Mendapatkan Volume "+bola.GetVolume());
        System.out.println("");
    }
}
