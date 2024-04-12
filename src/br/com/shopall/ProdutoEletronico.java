package br.com.shopall;

import java.util.Scanner;

public class ProdutoEletronico extends ProdutoBase {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void cadastraProduto() {
        String respostaTexto;

        super.cadastraProduto();
        System.out.println("Qual o modelo do produto?");
        respostaTexto = input.nextLine();
        this.setModelo(respostaTexto);


    }

    @Override
    public void mostraProduto(){
        super.mostraProduto();
        System.out.println("Modelo: " + this.getModelo());
    }




}
