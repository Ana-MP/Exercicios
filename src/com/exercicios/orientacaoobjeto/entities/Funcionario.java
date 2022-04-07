package com.exercicios.orientacaoobjeto.entities;

public class Funcionario {

    public String Nome;
    public double SalarioBruto;
    public double Imposto;
    public double Taxa;

    public double calculaSalarioImposto (){

        return SalarioBruto-Imposto;
    }

    public double calculaTaxa(double porcentagem ){

        return SalarioBruto+=SalarioBruto*porcentagem/100;
    }

    public String toString(){
        return Nome + ", R$"+ String.format("%.2f",calculaSalarioImposto());
    }


    }

