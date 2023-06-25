package br.com.coffeeandit.livro;

public class CalcularReajuste implements Calculos {

    public static final String SOMA = "+";
    public static final String DIMINUICAO = "-";

    public CalcularReajuste(){};



    private double calcular(Livro livro, double indice, String operacao ){
        double indiceEscopo = indice;
        if(operacao.equals(SOMA)){
            livro.aumentarPreco(indiceEscopo);
        }else {
            livro.diminuirPreco(indiceEscopo);
        }
        return livro.getPreco();
    }


    @Override
    public double aumentarPreco(Livro livro, double indice) {
        return calcular(livro, indice, SOMA);
    }

    @Override
    public double diminuirPreco(Livro livro, double indice) {
        return calcular(livro, indice, DIMINUICAO);
    }
}
