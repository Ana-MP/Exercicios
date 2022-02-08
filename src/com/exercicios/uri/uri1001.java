package com.exercicios.uri;

import java.util.Scanner;

public class uri1001 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int A = scanner.nextInt();
        System.out.println("Informe o valor: ");
        int B = scanner.nextInt();
        int X = A+B;
        System.out.println(" A soma do valor: "+ X);
        scanner.close();
    }
}
