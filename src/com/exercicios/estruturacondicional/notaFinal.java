package com.exercicios.estruturacondicional;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class notaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota do  primeira semestre : ");
        double nota1= scanner.nextDouble();
        System.out.println("Informe a  nota do segunda  semestre: ");
        double nota2= scanner.nextDouble();

        double notaFinal = nota1+ nota2;
        System.out.println("NOTA FINAL = "+ notaFinal);

        if (notaFinal<60){
            System.out.println("REPROVADO");
        }
        
        scanner.close();
    }
}
