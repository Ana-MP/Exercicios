package com.exercicios.orientacaoobjeto.aplication;

import com.exercicios.orientacaoobjeto.entities.triangulo;

import java.util.Scanner;

public class programaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        triangulo x,y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Informe as medidas do triângulo X");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Informe as medidas do triângulo Y");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Área triângulo X ="+areaX);
        System.out.println("Área triângulo Y ="+areaY);

        if (areaX>areaY){
            System.out.println("Área maior X= "+areaX);
        }else {
            System.out.println("Área maior Y= "+areaY);
        }


        scanner.close();
    }
}
