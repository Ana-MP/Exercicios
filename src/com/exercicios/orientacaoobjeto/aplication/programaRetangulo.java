package com.exercicios.orientacaoobjeto.aplication;

import com.exercicios.orientacaoobjeto.entities.retangulo;

import java.util.Scanner;

public class programaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        retangulo Retangulo =new retangulo();

        System.out.println("Informe a medida da Base: ");
        Retangulo.base= scanner.nextDouble();

        System.out.println("Informe a medida da Altura: ");
        Retangulo.altura= scanner.nextDouble();

        System.out.printf("Area = %.2f%n", Retangulo.area());
        System.out.printf("Perimetro = %.2f%n", Retangulo.perimetro());
        System.out.printf("Diagonal= %.2f%n", Retangulo.diagonal());

        scanner.close();
    }
}
