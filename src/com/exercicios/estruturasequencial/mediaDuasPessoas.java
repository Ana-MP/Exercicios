package com.exercicios.estruturasequencial;


import java.util.Scanner;

public class mediaDuasPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1 = scanner.next();
        int idade1 = scanner.nextInt();
        String nome2 = scanner.next();
        int idade2 = scanner.nextInt();
        double media= (double) (idade1 + idade2) / 2;
        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
        scanner.close();




    }
}

