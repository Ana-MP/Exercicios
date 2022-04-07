package com.exercicios.orientacaoobjeto.aplication;

import com.exercicios.orientacaoobjeto.entities.Estudante;

import java.util.Scanner;

public class programaEstudante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Infome o nome do estudante: ");
        estudante.Nome = scanner.nextLine();
        System.out.println("Infome a primeira nota: ");
        estudante.Nota1= scanner.nextDouble();
        System.out.println("Infome a segunda nota: ");
        estudante.Nota2= scanner.nextDouble();
        System.out.println("Infome a terceira nota: ");
        estudante.Nota3 = scanner.nextDouble();
        estudante.notaFinal();
        System.out.printf("Nota Final = %.2f%n ",estudante.notaFinal());
        if (estudante.notaFinal()<60){
            System.out.println("Reprovado");
            System.out.printf("Faltam %.2f pontos ", estudante.calculoNota());
        }else {
            System.out.println("Aprovado");
        }


        scanner.close();
    }
}
