package com.exercicios.estruturasequencial;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.println("Entre com uma nota");

            double nota = scanner.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);

      scanner.close();
    }
}
