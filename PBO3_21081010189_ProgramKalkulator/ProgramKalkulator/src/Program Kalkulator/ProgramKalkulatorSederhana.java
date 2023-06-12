/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Daniel Manalu
 * 
 */
public class ProgramKalkulatorSederhana {
    public static void main(String[] args) {
        Penjumlahan HasilJumlah = new Penjumlahan();
        System.out.println("Hasil Penjumlahan adalah "+ HasilJumlah.HasilPenjumlahan());
        
        Pengurangan HasilKurang = new Pengurangan();
        System.out.println("Hasil Pengurangan adalah "+ HasilKurang.HasilPengurangan());
        
        Perkalian HasilKali = new Perkalian();
        System.out.println("Hasil Perkalian adalah "+ HasilKali.HasilPerkalian());
        
        Pembagian HasilBagi = new Pembagian();
        System.out.println("Hasil Pembagian adalah "+ HasilBagi.HasilPembagian());
    }
}
