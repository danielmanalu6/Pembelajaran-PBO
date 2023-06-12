/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo8_21081010189_overloadrid;

/**
 *
 * @author Daniel Manalu
 */
public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void kuliah() {
        System.out.println(nama + " sedang kuliah.");
    }
}
