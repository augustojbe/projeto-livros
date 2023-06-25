package br.com.coffeeandit.fisico;

import br.com.coffeeandit.livro.Livro;

public class LivroFisico extends Livro {

    public static final double INDICE_FICICO = 0.05d;

    public LivroFisico(String titulo, String autor, String editora, double preco, int paginas) {
        super(titulo, autor, editora, preco, paginas);
    }



    @Override
    protected String getCapa() {
        return "www.coffeeandit.store/capa_livro_fisico.jpg";
    }


    @Override
    protected void aumentarPreco(double percentual) {
        double percentualNovo = percentual + INDICE_FICICO;
        setPreco(getPreco() + (getPreco() * percentualNovo));

    }

    @Override
    protected void diminuirPreco(double percentual) {
        double percentualNovo = percentual + INDICE_FICICO;
        setPreco(getPreco() - (getPreco() * percentualNovo));

    }
}
