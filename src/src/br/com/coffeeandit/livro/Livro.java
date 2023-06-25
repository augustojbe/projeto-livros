package br.com.coffeeandit.livro;

public abstract class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private int paginas;



    public Livro(String titulo, String autor, String editora, double preco, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.paginas = paginas;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }



    protected abstract String getCapa();

    protected void aumentarPreco(final double percentual){
        preco += preco * percentual;
    }
    protected void diminuirPreco(double percentual) {
        preco -= preco * percentual;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                ", paginas=" + paginas +
                '}';
    }


}
