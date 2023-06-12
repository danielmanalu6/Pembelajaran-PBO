/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorkompleks2;
import java.util.Scanner;
/**
 *
 * @author Daniel Manalu
 */
public class KalkulatorKompleks2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan proses: ");
        String expression = input.nextLine();
        Kalkulator evaluator = new Kalkulator();
        double result = evaluator.evaluate(expression);
        System.out.println("Hasil: " + result);
        input.close();
    }
}

  
