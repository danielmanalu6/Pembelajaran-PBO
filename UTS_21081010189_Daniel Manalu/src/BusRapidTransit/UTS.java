/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package BusRapidTransit;

import java.util.ArrayList;

public class UTS {
    public static void main(String[] args) {
        Bus bus = new Bus(20);
        System.out.println("BUS MEMILIKI PERJALANAN DARI"
                + " KANTOR-PORONG-SURABAYA-GRESIK-MADURA-KALIMANTAN\n");
        System.out.println("-------------------------------------------------------");
        Penumpang p1 = new Penumpang("Ali", "Surabaya");
        Penumpang p2 = new Penumpang("Budi", "Porong");
        Penumpang p3 = new Penumpang("Dimas", "Madura");
        Penumpang p4 = new Penumpang("Daniel", "Kalimantan");
        Penumpang p5 = new Penumpang("Pangestu", "Kalimantan");

        // Penumpang naik
        bus.naikPenumpang(p1);
        bus.naikPenumpang(p2);
        bus.naikPenumpang(p3);
        bus.naikPenumpang(p4);
        bus.naikPenumpang(p5);

        // Cetak penumpang yang ada di dalam bus
        System.out.println("Penumpang di dalam bus (Kantor):"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        System.out.println("");

        // Penumpang turun
        bus.turunPenumpang("Budi");
        System.out.println("=======================================================");
        // Cetak penumpang yang ada di dalam bus setelah Budi turun
        System.out.println("Penumpang di dalam bus setelah Budi turun di Halte PORONG:"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();

        // Penumpang naik lagi
        Penumpang p6 = new Penumpang("Deni", "Kalimantan");
        Penumpang p7 = new Penumpang("Eva", "Gresik");

        // Cek apakah penumpang dapat naik atau tidak
        if (bus.naikPenumpang(p6)) {
            System.out.println("* "+p6.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p6.getNama() + " tidak dapat naik ke dalam bus");
        }

        if (bus.naikPenumpang(p7)) {
            System.out.println("* "+p7.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p7.getNama() + " tidak dapat naik ke dalam bus");
        }

        // Cetak penumpang yang ada di dalam bus setelah penumpang naik lagi
        System.out.println("Penumpang di dalam bus setelah penumpang naik lagi(PORONG):"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        // Penumpang turun
        bus.turunPenumpang("Ali");

        System.out.println("");
        System.out.println("=======================================================");
        // Cetak penumpang yang ada di dalam bus setelah Ali turun
        System.out.println("Penumpang di dalam bus setelah Ali turun di Halte SURABAYA:"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        // Penumpang naik lagi
        Penumpang p8 = new Penumpang("Victor", "Gresik");
        
        // Cek apakah penumpang dapat naik atau tidak
        if (bus.naikPenumpang(p8)) {
            System.out.println("* "+p8.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p8.getNama() + " tidak dapat naik ke dalam bus");
        }
        
        // Cetak penumpang yang ada di dalam bus setelah penumpang naik lagi
        System.out.println("Penumpang di dalam bus setelah penumpang naik lagi(SURABAYA):"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        System.out.println("");
        System.out.println("=======================================================");
        // Penumpang turun
        bus.turunPenumpang("Victor");
        bus.turunPenumpang("Eva");
        // Cetak penumpang yang ada di dalam bus setelah Victor-Eva turun
        System.out.println("Penumpang di dalam bus setelah Victor dan Eva turun di Halte GRESIK:"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        // Penumpang naik lagi
        Penumpang p9 = new Penumpang("Gunawan", "Madura");
        Penumpang p10 = new Penumpang("Hendropriyono", "Kalimantan");
        
        // Cek apakah penumpang dapat naik atau tidak
        if (bus.naikPenumpang(p9)) {
            System.out.println("* "+p9.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p9.getNama() + " tidak dapat naik ke dalam bus");
        }
        if (bus.naikPenumpang(p10)) {
            System.out.println("* "+p10.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p10.getNama() + " tidak dapat naik ke dalam bus");
        }
        
        // Cetak penumpang yang ada di dalam bus setelah penumpang naik lagi
        System.out.println("Penumpang di dalam bus setelah penumpang naik lagi(GRESIK):"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        System.out.println("");
        System.out.println("=======================================================");
        // Penumpang turun
        bus.turunPenumpang("Dimas");
        bus.turunPenumpang("Gunawan");
        // Cetak penumpang yang ada di dalam bus setelah Dimas-Gunanwan turun
        System.out.println("Penumpang di dalam bus setelah Dimas dan Gunawan turun di Halte MADURA:"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        // Penumpang naik lagi
        Penumpang p11 = new Penumpang("Manalu", "Kalimantan");
        Penumpang p12 = new Penumpang("Dawam", "Kalimantan");
        
        // Cek apakah penumpang dapat naik atau tidak
        if (bus.naikPenumpang(p11)) {
            System.out.println("* "+p11.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p11.getNama() + " tidak dapat naik ke dalam bus");
        }
        if (bus.naikPenumpang(p12)) {
            System.out.println("* "+p12.getNama() + " naik ke dalam bus");
        } else {
            System.out.println("* "+p12.getNama() + " tidak dapat naik ke dalam bus");
        }
        
        // Cetak penumpang yang ada di dalam bus setelah penumpang naik lagi
        System.out.println("Penumpang di dalam bus setelah penumpang naik lagi(MADURA):"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        
        System.out.println("");
        // Penumpang turun
        bus.turunPenumpang("Daniel");
        bus.turunPenumpang("Pangestu");
        bus.turunPenumpang("Deni");
        bus.turunPenumpang("Hendropriyono");
        bus.turunPenumpang("Manalu");
        bus.turunPenumpang("Dawam");

        // Cetak penumpang yang ada di dalam bus setelah Daniel-Pangesti-Deni-Hendropriyono-Manalu-Dawam turun
        System.out.println("Penumpang di dalam bus setelah Daniel, Pangestu, Deni, Hendropriyono, Manalu"
                + ", dan Dawam turun di Halte KALIMANTAN:"+bus.GetJumlahPenumpang()+" penumpang");
        bus.cetakPenumpang();
        System.out.println("Penumpang Bus di Halte Terakhir(Kalimantan) Tidak Ada atau Habis");
    }
}
