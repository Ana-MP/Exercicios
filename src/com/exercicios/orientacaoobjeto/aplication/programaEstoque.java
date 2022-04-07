package com.exercicios.orientacaoobjeto.aplication;

import com.exercicios.orientacaoobjeto.entities.Produto;

import java.util.Scanner;


public class programaEstoque {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto= new Produto();
        System.out.println( "Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome= scanner.nextLine();
        System.out.print("Preço:");
        produto.preco= scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade=scanner.nextInt();

        System.out.println();
        System.out.println("Informação dos produtos" + produto);


        System.out.println();
        System.out.println("Quantidade para ser adicionada:  " );
        int quantidade = scanner.nextInt();
        produto.adicionaProduto(quantidade);

        System.out.println();
        System.out.println("Dados Atualizados: " + produto);

        System.out.println();
        System.out.println("Quantidade para ser removida:  " );
        quantidade = scanner.nextInt();
        produto.removeProduto(quantidade);

        System.out.println();
        System.out.println("Dados Atualizados: " + produto);


        scanner.close();
    }
}
