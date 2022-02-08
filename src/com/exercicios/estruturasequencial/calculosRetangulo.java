package com.exercicios.estruturasequencial;

//Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
//        mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
//        decimais, conforme exemplo.

import java.util.Scanner;

public class calculosRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base: ");
        double base = scanner.nextDouble();
        System.out.println("Informe o valor da altura");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = (2*base) + (2*altura);
        double diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

        System.out.printf("A área do retângulo é: .%4f%n O perímetro  do retângulo é: .%4f%n A diagonal do retângulo é: .%4f%n  ",area,perimetro,diagonal );

     scanner.close();
    }
}
