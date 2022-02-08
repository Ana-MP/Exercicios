package com.exercicios.vetor;

import java.util.Scanner;

public class lendoNumeros {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int [] vetor = new int [N];

        for (int i=0; i<N; i++){
            vetor[i] = scanner.nextInt();
            }
        for (int i=0; i<N;i++){
            if(vetor[i]<0){
                System.out.println(vetor[i]);
        }

        }


        scanner.close();
    }

}
