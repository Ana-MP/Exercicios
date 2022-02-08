package com.exercicios.estruturasequencial;

//Fazer um programa para ler as medidas da largura e comprimento de um terreno
//        retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
//        com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
//        terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
//        conforme exemplo.

import java.util.Scanner;

public class medidasDeUmterreiro {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe a largura do terreno:  ");
        double largura= scanner.nextDouble();
        System.out.println("Informe o comprimento do terreno:  ");
        double comprimento= scanner.nextDouble();
        System.out.println("Informe o valor do metro quadrado:");
        double valorMetroQuadrado = scanner.nextDouble();
        double area= largura*comprimento;
        double calculo = area*valorMetroQuadrado;
        System.out.printf("Area do terreno: %.2f%n ", area);
        System.out.printf("Valor  do terreno: %.2f%n ",calculo);


        scanner.close();

    }

}
