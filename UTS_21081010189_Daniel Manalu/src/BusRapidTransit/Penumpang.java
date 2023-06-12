/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusRapidTransit;
import java.util.Random;
/**
 *
 * @author Daniel Manalu
 */
public class Penumpang {
    private String nama;
    private String tujuan;

    public Penumpang(String nama, String tujuan) {
        this.nama = nama;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public String getTujuan() {
        return tujuan;
    }
}
