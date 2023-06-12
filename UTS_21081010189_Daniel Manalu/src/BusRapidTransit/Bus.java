/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusRapidTransit;
import java.util.ArrayList;

/**
 *
 * @author Daniel Manalu
 */
public class Bus {
    private int kapasitas;
    private ArrayList<Penumpang> penumpang;
    
    
    public Bus(int kapasitas) {
        this.kapasitas = kapasitas;
        penumpang = new ArrayList<Penumpang>();
    }

    public boolean naikPenumpang(Penumpang penumpang) {
        if (this.penumpang.size() < kapasitas) {
            this.penumpang.add(penumpang);
            return true;
        } else {
            return false;
        }
    }
    
    public int GetJumlahPenumpang(){
        return this.penumpang.size();
    }

    public boolean turunPenumpang(String nama) {
        for (Penumpang penumpang : this.penumpang) {
            if (penumpang.getNama().equals(nama)) {
                this.penumpang.remove(penumpang);
                return true;
            }
        }
        return false;
    }

    public void cetakPenumpang() {
        for (Penumpang penumpang : this.penumpang) {
            System.out.println(penumpang.getNama() + " - " + penumpang.getTujuan());
        }
    }
}
