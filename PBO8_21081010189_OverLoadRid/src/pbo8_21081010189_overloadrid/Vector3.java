/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo8_21081010189_overloadrid;

/**
 *
 * @author Daniel Manalu
 */
public class Vector3 {
    private int[] elements;

    public Vector3(int x, int y, int z) {
        elements = new int[3];
        elements[0] = x;
        elements[1] = y;
        elements[2] = z;
    }

    public Vector3 perkalianScalar(int scalar) {
        Vector3 hasil = new Vector3(0, 0, 0);
        hasil.getElements()[0] = elements[0] * scalar;
        hasil.getElements()[1] = elements[1] * scalar;
        hasil.getElements()[2] = elements[2] * scalar;
        return hasil;
    }

    public Vector3 perkalianScalar(int[] array) {
        Vector3 hasil = new Vector3(0, 0, 0);
        hasil.getElements()[0] = elements[0] * array[0];
        hasil.getElements()[1] = elements[1] * array[1];
        hasil.getElements()[2] = elements[2] * array[2];
        return hasil;
    }

    public int perkalianVectorVector(Vector3 other) {
        int hasil = 0;
        hasil += elements[0] * other.getElements()[0];
        hasil += elements[1] * other.getElements()[1];
        hasil += elements[2] * other.getElements()[2];
        return hasil;
    }

    public int[] getElements() {
        return elements;
    }
}
