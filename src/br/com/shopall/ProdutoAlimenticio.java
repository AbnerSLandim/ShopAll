package br.com.shopall;

public class ProdutoAlimenticio extends ProdutoBase {
    private String dataValidade;
    private String ingredientes;

    public void concatenacaoString(int dia, int mes, int ano){

        String palavraConcatenada, doisDigitos,  diaString, mesString, anoString;

        doisDigitos = String.format("%02d", dia);
        diaString = String.valueOf(doisDigitos);

        doisDigitos = String.format("%02d", mes);
        mesString = String.valueOf(doisDigitos);

        doisDigitos = String.format("%02d", ano);
        anoString = String.valueOf(doisDigitos);


        palavraConcatenada = diaString.concat("/" + mesString).concat("/" + anoString);
        this.setDataValidade(palavraConcatenada);
    }

    @Override
    public void cadastraProduto() {
        String respostaTexto;
        int respostaDia,respostaMes, respostaAno;

        super.cadastraProduto();
        System.out.println("Qual os ingredientes do produto?");
        respostaTexto = input.nextLine();
        this.setIngredientes(respostaTexto);

        System.out.println("Utilize apenas dois digitos na validade");
        System.out.println("Qual o dia de validade?");
        respostaDia = input.nextInt();
        input.nextLine();

        System.out.println("Qual o mes de validade?");
        respostaMes = input.nextInt();
        input.nextLine();

        System.out.println("Qual o ano de validade?");
        respostaAno = input.nextInt();
        input.nextLine();

        concatenacaoString(respostaDia,respostaMes,respostaMes);



    }

    @Override
    public void mostraProduto(){
        super.mostraProduto();
        System.out.println("Ingredientes: " + this.getIngredientes());
        System.out.println("Data De Validade: " + this.getDataValidade());
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}
