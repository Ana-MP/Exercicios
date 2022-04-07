package com.exercicios.orientacaoobjeto.entities;

public class Estudante {

    public String Nome;
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double notaFinal() {
        return Nota1 + Nota2 + Nota3;
    }
    public double calculoNota(){
        if (notaFinal()<60){
            return 60 -notaFinal();
        }else {
            return 0;
        }
    }
}
