package br.com.shopall;

import java.util.ArrayList;
import java.util.Scanner;

public class RodandoPrograma {

    public static Scanner inputResposta = new Scanner(System.in);

    public void sistemaRodando(){
        boolean rodando = true;
        int resposta = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("--Seja bem vindo ao sistema de cadastro de produtos ShopAll--");
        System.out.println("-------------------------------------------------------------");

        do{
            System.out.println("O que deseja fazer?");

            System.out.println("2-Mostrar Produtos cadastrados");
            System.out.println("1-Cadastrar produto");
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
                    break;

                case 1:
                    System.out.println("Que tipo de produto deseja cadastrar?");
                    System.out.println("4-Produto Bebida");
                    System.out.println("3-Produto Alimento");
                    System.out.println("2-Produto Vestuário");
                    System.out.println("1-Produto Eletrônico");
                    System.out.println("0-Voltar");
                    System.out.println("");
                    break;
            }

        }while(rodando);

    }


    public void switchDeControleCadastra(){

    }

}
