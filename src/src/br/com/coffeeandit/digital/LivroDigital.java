package br.com.coffeeandit.digital;

import br.com.coffeeandit.livro.Livro;

public class LivroDigital extends Livro {

    public static final double INDICE_VIRTUAL = 0.03d;
    private String qrcode;

    public LivroDigital(String titulo, String autor, String editora, double preco, int paginas, final String qrcode) {
        super(titulo, autor, editora, preco, paginas );
        this.qrcode= qrcode;
    }

    @Override
    protected String getCapa() {
        return "www.coffeeandit.store/capa_livro_digital.jpg";
    }


    @Override
    protected void aumentarPreco(double percentual) {
        double percentualNovo = percentual + INDICE_VIRTUAL;
        setPreco(getPreco() + (getPreco() * percentualNovo));



    }

    @Override
    protected void diminuirPreco(double percentual) {
        double percentualNovo = percentual + INDICE_VIRTUAL;
        setPreco(getPreco() - (getPreco() * percentualNovo));

    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + getTitulo()+ '\'' +
                ", autor='" + getAutor() + '\'' +
                ", editora='" + getEditora() + '\'' +
                ", preco=" + getPreco() +
                ", qrcode=" + qrcode +
                '}';
    }
}
