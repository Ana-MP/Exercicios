package com.exercicios.uri;

import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PARA CALCULAR AS RAÍZES DA EQUAÇÃO");

        System.out.println(" Informe o valor de A:");
        double A = scanner.nextDouble();

        System.out.println(" Informe o valor de B:");
        double B = scanner.nextDouble();

        System.out.println(" Informe o valor de C:");
        double C = scanner.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossível calcular");

        }else {
            double X1 = (-B+ Math.sqrt(delta)) /(2*A);
            double X2 = (-B- Math.sqrt(delta)) /(2*A);
            System.out.printf("O valor da raiz 1 é: .%4f%n O valor da raiz 2 é: .%4f%n ",X1,X2);
        }
        scanner.close();
    }
}
