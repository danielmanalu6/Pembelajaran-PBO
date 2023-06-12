/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo8_21081010189_overloadrid;

/**
 *
 * @author Daniel Manalu
 */
public class MahasiswaLulus extends MahasiswaAktif{
    private int tahunLulus;

    public MahasiswaLulus(String nama, int semester, int tahunLulus) {
        super(nama, semester);
        this.tahunLulus = tahunLulus;
    }

    public void kuliah(String mataKuliah) {
        System.out.println(nama + " telah lulus pada tahun " + tahunLulus + ", tidak dapat mengikuti kuliah.");
    }

    public void wisuda() {
        System.out.println(nama + " telah wisuda pada tahun " + tahunLulus);
    }
}
