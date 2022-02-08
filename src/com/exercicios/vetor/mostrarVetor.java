package com.exercicios.vetor;

import java.util.Scanner;

public class mostrarVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetor = new int[5];
        for (int i=0; i<=5; i++){
            vetor[i]= scanner.nextInt();
            System.out.println(vetor[i]);
        }

        scanner.close();

    }
}
