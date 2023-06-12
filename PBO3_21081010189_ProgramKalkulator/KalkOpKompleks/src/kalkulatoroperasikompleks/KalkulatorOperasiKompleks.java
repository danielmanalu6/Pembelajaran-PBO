/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatoroperasikompleks;
import java.util.Scanner;
/**
 *
 * @author Daniel Manalu
 */
public class KalkulatorOperasiKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = input.nextLine();
        double result = evaluate(expression);

        System.out.println("Result: " + result);

        input.close();
    }

    private static double evaluate(String expression) {
        String[] tokens = expression.split(" ");

        double result = Double.parseDouble(tokens[0]);
        char operator = ' ';

        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.length() == 1 && "+-*/".contains(token)) {
                operator = token.charAt(0);
            } else {
                double num = Double.parseDouble(token);

                switch (operator) {
                    case '+':
                        result += num;
                        break;
                    case '-':
                        result -= num;
                        break;
                    case '*':
                        result *= num;
                        break;
                    case '/':
                        if (num == 0) {
                            System.out.println("Error: Division by zero!");
                            System.exit(1);
                        } else {
                            result /= num;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        System.exit(1);
                        break;
                }
            }
        }
        return result;
    }
    
}
