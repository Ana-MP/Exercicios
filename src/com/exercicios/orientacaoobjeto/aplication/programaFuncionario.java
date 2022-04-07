package com.exercicios.orientacaoobjeto.aplication;

import com.exercicios.orientacaoobjeto.entities.Funcionario;

import java.util.Scanner;

public class programaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("(Infome o nome do funcionário: ");
        funcionario.Nome= scanner.nextLine();
        System.out.println("(Infome o salário  do funcionário: ");
        funcionario.SalarioBruto= scanner.nextDouble();
        System.out.println("Funcionário: "+ funcionario);
        System.out.println("(Infome o imposto : ");
        funcionario.Imposto= scanner.nextDouble();
        funcionario.calculaSalarioImposto();
        System.out.println("(Infome a taxa de incremento: ");
        double porcentagem = scanner.nextDouble();
        funcionario.calculaTaxa(porcentagem);
        System.out.println("Dados Atualizados: "+ funcionario);
        scanner.close();

    }

}
