/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo8_21081010189_overloadrid;

/**
 *
 * @author Daniel Manalu
 */
public class MainOverLoadRid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tugas 1
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(4, 5, 6);

        Vector3 scalarResult = v1.perkalianScalar(5);
        System.out.println("Vector Kali Skalar: [" + scalarResult.getElements()[0] + " " +
                scalarResult.getElements()[1] + " " + scalarResult.getElements()[2] + "] (Vector)");

        int dotProductResult = v1.perkalianVectorVector(v2);
        System.out.println("Vector Kali Vector: " + dotProductResult);

        int[] array = {4, 8, 9};
        Vector3 arrayResult = v1.perkalianScalar(array);
        System.out.println("Vector Kali Array Scalar: [" + arrayResult.getElements()[0] + " " +
                arrayResult.getElements()[1] + " " + arrayResult.getElements()[2] + "]");
        System.out.println("\n\n");
        
        //Tugas 2
        Mahasiswa m1 = new Mahasiswa("Andi");
        m1.kuliah();

        MahasiswaAktif m2 = new MahasiswaAktif("Budi", 4);
        m2.kuliah();

        MahasiswaAktif m3 = new MahasiswaAktif("Gunawan", 5);
        m3.kuliah("Pemrograman Java");

        MahasiswaLulus m4 = new MahasiswaLulus("Daniel", 8, 2022);
        m4.kuliah("Algoritma");
        m4.wisuda();
    }
}
