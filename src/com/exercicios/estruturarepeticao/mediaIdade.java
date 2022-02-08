package com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();
        int soma = 0;
        int contador = 0;

                while (idade>=0) {
                    System.out.println("Digite uma idade: ");
                    soma = soma + idade;
                    contador = contador + 1;
                    idade = scanner.nextInt();
                }
                    if(contador>0){
                       double media=(double) soma/contador;
                        System.out.println(media);
                    }else{
                        System.out.println("Impossível calcular");
                    }





        scanner.close();
    }
}
