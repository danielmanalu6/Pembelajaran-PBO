/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo8_21081010189_overloadrid;

/**
 *
 * @author Daniel Manalu
 */
public class MahasiswaAktif extends Mahasiswa {
    private int semester;

    public MahasiswaAktif(String nama, int semester) {
        super(nama);
        this.semester = semester;
    }

    public void kuliah() {
        System.out.println(nama + " sedang kuliah semester " + semester);
    }

    public void kuliah(String mataKuliah) {
        System.out.println(nama + " sedang kuliah mata kuliah " + mataKuliah + " semester " + semester);
    }
}
