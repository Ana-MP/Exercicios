package com.exercicios.orientacaoobjeto.entities;

public class retangulo {

    public double base;
    public double altura;


    public double area () {
         return altura * base;
    }
    public double perimetro (){
        return 2*( base+altura);
    }
    public double diagonal (){
        return Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
    }
}

