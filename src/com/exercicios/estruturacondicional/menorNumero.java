package com.exercicios.estruturacondicional;

import java.util.Scanner;

public class menorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero1 = scanner.nextInt();

        System.out.println("Informe um número");
        int numero2 = scanner.nextInt();

        System.out.println("Informe um número");
        int numero3 = scanner.nextInt();

        if ( numero1< numero2 && numero1< numero3){
            System.out.println("O menor número é: "+ numero1);
        }else if (numero2<numero3){
                System.out.println("O menor número é: "+ numero2);
            }else {
                System.out.println("O menor número é: "+ numero3);
            }

        scanner.close();
    }
}
