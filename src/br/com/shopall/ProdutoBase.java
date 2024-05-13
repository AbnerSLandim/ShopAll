package br.com.shopall;

import java.util.Scanner;
public class ProdutoBase{

    public static Scanner input = new Scanner(System.in);
    private String nomeProduto;
    private double precoProduto;
    private String descricaoProduto;
    //Adiciona "estoque" não sei se é Boolean ou Int
    private int estoque;
    private String nomeFabricante;
    private String enderecoFabricante;
    private String telefoneFabricante;

    protected void fechaInput(){
        input.close();
    }

    public void cadastraProduto() {
        String respostaString;
        double respostaDouble;
        int respostaInt;

        System.out.println("Qual o nome do produto?");
        respostaString = input.nextLine();
        this.setNomeProduto(respostaString);

        System.out.println("Qual o preço do produto");
        respostaDouble = verificaSeENumero();
        this.setPrecoProduto(respostaDouble);
        input.nextLine();

        System.out.println("Qual a Descrição do produto?");
        respostaString = input.nextLine();
        this.setDescricaoProduto(respostaString);

        System.out.println("Qual a quantidade de produtos no estoque?");
        respostaInt = input.nextInt();
        input.nextLine();
        this.setEstoque(respostaInt);

        System.out.println("Qual o nome do fabricante do produto?");
        respostaString = input.nextLine();
        this.setNomeFabricante(respostaString);

        System.out.println("Qual o endereço do fabricante?");
        respostaString = input.nextLine();
        this.setEnderecoFabricante(respostaString);

        System.out.println("Qual o telefone para contato com o fabricante?");
        respostaString = input.nextLine();
        this.setTelefoneFabricante(respostaString);



    }


    protected void mostraProduto() {
        System.out.println("Nome: " + this.getNomeProduto());
        System.out.println("Preço: R$" + String.format("%.2f", this.getPrecoProduto()));
        System.out.println("Descrição: " + this.getDescricaoProduto());
        System.out.println("Estoque: " + this.getEstoque());
        System.out.println("Fabricante: " + this.getNomeFabricante());
        System.out.println("Endereço Fabricante: " + this.getEnderecoFabricante());
        System.out.println("Telefone Fabricante: " + this.getTelefoneFabricante());
    }


    public double verificaSeENumero(){
        double valor = 0;
        boolean respostaBoolean = true;

        do {
            try{
                valor = input.nextDouble();
                respostaBoolean = false;

            }catch (Exception e){
                System.out.println("Esse não é um valor válido");
                System.out.println("Por favor tente novamente");
                input.next();
            }
        }while (respostaBoolean);

        return valor;
    }




    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }


    public String getNomeFabricante() {
        return nomeFabricante;
    }
    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }


    public String getEnderecoFabricante() {
        return enderecoFabricante;
    }
    public void setEnderecoFabricante(String enderecoFabricante) {
        this.enderecoFabricante = enderecoFabricante;
    }


    public String getTelefoneFabricante() {
        return telefoneFabricante;
    }
    public void setTelefoneFabricante(String telefoneFabricante) {
        this.telefoneFabricante = telefoneFabricante;
    }



}
