package com.exercicios.estruturasequencial;

import java.util.Scanner;

public class somatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número quando quiser sair digite 0 para ver a soma");
        int valor = scanner.nextInt();
        int soma = 0;


        while (valor != 0){
            System.out.println("Digite um número");
            soma+=valor;
            valor = scanner.nextInt();


        }

        System.out.println("A soma é: "+soma);
        scanner.close();
    }
}
