package com.exercicios.estruturacondicional;

import java.util.Scanner;

public class operadoraTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de minutos utilizados: ");
        double minutos = scanner.nextDouble();
        if(minutos<= 100){
            System.out.println("Valor: R$ 50,00");
        }else{
            double conta = ((minutos- 100)*2)+50;
            System.out.println("Valor: "+conta);

        }
        scanner.close();
    }
}
