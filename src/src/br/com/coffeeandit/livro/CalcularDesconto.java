package br.com.coffeeandit.livro;

public class CalcularDesconto implements Calculos {
    @Override
    public double aumentarPreco(Livro livro, double indice) {
        return 0;
    }

    @Override
    public double diminuirPreco(Livro livro, double indice) {
        livro.diminuirPreco(indice);
        return livro.getPreco();
    }
}
