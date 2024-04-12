package br.com.shopall;

public class ProdutoBebida extends ProdutoAlimenticio {
    private boolean alcoolico;
    private int volume;

    public boolean getAlcoolico() {
        return alcoolico;
    }

    public void setAlcoolico(boolean alcoolico) {
        this.alcoolico = alcoolico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void cadastraProduto() {
        String respostaString;
        int respostaInt;
        boolean respostaBoolean = true;

        super.cadastraProduto();
        System.out.println("O Produto contém álcool? (S)im (N)ão");
        respostaString = input.nextLine();
        if (respostaString.equalsIgnoreCase("S")) {
            this.setAlcoolico(true);
        } else {
            this.setAlcoolico(false);
        }

       do{
           try{
               System.out.println("Qual o volume do produto em ml?");
               respostaInt = input.nextInt();
               this.setVolume(respostaInt);

               respostaBoolean = false;
           }catch(Exception e){
               System.out.println("Esse não é um valor válido!");
               System.out.println("Tente Novamente\n");
               input.next();
           }
       }while (respostaBoolean);
    }


    public void mostraProduto(){
        String resposta;
        if (getAlcoolico() == true){
            resposta = "Sim";
        }
        else {
            resposta = "Não";
        }

        super.mostraProduto();
        System.out.println("Volume: " + getVolume() + "ml" );
        System.out.println("Alcoólico: " +  resposta);

    }

}

