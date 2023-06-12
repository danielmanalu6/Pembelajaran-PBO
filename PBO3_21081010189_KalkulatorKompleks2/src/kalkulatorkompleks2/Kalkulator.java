/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorkompleks2;

/**
 *
 * @author Daniel Manalu
 */
public class Kalkulator {
    private double result;
    private char operator;

    public double evaluate(String expression) {
        String[] tokens = expression.split(" ");
        result = Double.parseDouble(tokens[0]);
        operator = ' ';

        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.length() == 1 && "+-*/".contains(token)) {
                char currOperator = token.charAt(0);
                if (currOperator == '*' || currOperator == '/') {
                    // If the current operator has higher precedence than the previous operator,
                    // process the next token first.
                    if (operator == '+' || operator == '-') {
                        double nextNum = Double.parseDouble(tokens[i+1]);
                        processToken(currOperator, nextNum);
                        i++;
                    } else {
                        operator = currOperator;
                    }
                } else {
                    operator = currOperator;
                }
            } else {
                double num = Double.parseDouble(token);
                processToken(operator, num);
            }
        }
        return result;
    }

    private void processToken(char currOperator, double num) {
        if (currOperator == '*') {
            result *= num;
        } else if (currOperator == '/') {
            if (num == 0) {
                System.out.println("Error: Hasil Bagi adalah 0!");
                System.exit(1);
            } else {
                result /= num;
            }
        } else if (currOperator == '+') {
            // If the previous operator was '*', process the multiplication first.
            if (operator == '*') {
                double prevNum = result;
                result = Double.parseDouble(String.format("%.15f", prevNum * num));
            } else {
                result += num;
            }
        } else if (currOperator == '-') {
            // If the previous operator was '*', process the multiplication first.
            if (operator == '*') {
                double prevNum = result;
                result = Double.parseDouble(String.format("%.15f", prevNum * num));
            } else {
                result -= num;
            }
        } else {
            System.out.println("Invalid operator!");
            System.exit(1);
        }
        operator = currOperator;
    }
}

