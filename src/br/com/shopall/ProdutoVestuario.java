package br.com.shopall;

public class ProdutoVestuario extends ProdutoBase {
    private String cor;
    private int tamanho;
    private String material;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void cadastraProduto() {
        String respostaTexto;
        int respostaInt;

        super.cadastraProduto();
        System.out.println("Qual o tamanho do produto?");
        respostaInt = input.nextInt();
        input.nextLine();

        System.out.println("Qual a cor do produto?");
        respostaTexto = input.nextLine();
        this.setCor(respostaTexto);

        System.out.println("Qual o material do Produto?");
        respostaTexto = input.nextLine();
        this.setMaterial(respostaTexto);



    }

    @Override
    public void mostraProduto(){
        super.mostraProduto();
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Material: " + this.getMaterial());
    }


}
