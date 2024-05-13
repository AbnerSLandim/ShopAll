package br.com.shopall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        int resposta = 0;
        Scanner inputResposta = new Scanner(System.in);

        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        ProdutoVestuario produtoVestuario = new ProdutoVestuario();
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio();
        ProdutoBebida produtoBebida = new ProdutoBebida();

        System.out.println("-------------------------------------------------------------");
        System.out.println("--Seja bem vindo ao sistema de cadastro de produtos ShopAll--");
        System.out.println("-------------------------------------------------------------");

        do{
            System.out.println("O que deseja fazer?");

            System.out.println("2-Mostrar Produtos cadastrados");
            System.out.println("1-Cadastrar produtos");
            System.out.println("0-Encerrar");
            System.out.println("");

            try{
                resposta = inputResposta.nextInt();
            }catch(Exception e){
                System.out.println("Esse não é um valor válido");
                System.out.println("Por favor tente novamente");
                inputResposta.next();
            }

            switch (resposta){
                case 0:
                    System.out.println("Finalizando processo...");
                    System.out.println("Sistema Finalizado");

                    rodando = false;
                    inputResposta.close();

                    break;

                case 1:
                    System.out.println("Cadastrando Produto Vestuário");
                    produtoVestuario.cadastraProduto();
                    System.out.println("\n");

                    System.out.println("Cadastrando Produto Eletrônico...");
                    produtoEletronico.cadastraProduto();
                    System.out.println("\n");

                    System.out.println("Cadastrando Produto Alimenticio");
                    produtoAlimenticio.cadastraProduto();
                    System.out.println("\n");

                    System.out.println("Cadastrando Produto Bebida");
                    produtoBebida.cadastraProduto();
                    System.out.println("\n");

                    break;

                case 2:
                    System.out.println("---Produto Vestuário---");
                    produtoVestuario.mostraProduto();
                    System.out.println("\n");

                    System.out.println("---Produto Eletrônico---");
                    produtoEletronico.mostraProduto();
                    System.out.println("\n");

                    System.out.println("---Produto Alimenticio---");
                    produtoAlimenticio.mostraProduto();
                    System.out.println("\n");

                    System.out.println("---Produto Bebida---");
                    produtoBebida.mostraProduto();
                    System.out.println("\n");

                    break;
            }

        }while(rodando);

    }
}