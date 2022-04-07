package com.exercicios.vetor;

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
        do vetor (supor não haver empates). Mostrar também a posição do maior elemento*/

import java.util.Scanner;

public class maiorMenor_comVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
       double[] vetor = new double[N];

        for (int i =0 ; i<=N; i++){
            vetor[i] =scanner.nextDouble();
        }
        double maior = vetor[0];
        scanner.close();
    }
}
