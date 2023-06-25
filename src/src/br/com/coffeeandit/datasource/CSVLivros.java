package br.com.coffeeandit.datasource;

import br.com.coffeeandit.fisico.LivroFisico;
import br.com.coffeeandit.livro.Livro;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVLivros implements ILivroDataSource {

    public static final String BOOK_CSV = "/Users/AUGUSTO/Desktop/projeto-livros/books.csv";
    public static final int POSICAO_TITULO = 0;
    public static final int POSICAO_AUTOR = 1;
    public static final int POSICAO_EDITORA = 4;
    public static final int POSICAO_PAGINA = 3;
    public static final int TAMANHO_CORRETO_COLUNA = 5;

    @Override
    public List<Livro> buscarLivros(){

        List<Livro> livros = new ArrayList<>();

        Path csvFile = Paths.get(System.getProperty("user.home") + BOOK_CSV);
        try {
            List<String> lines = Files.readAllLines(csvFile, StandardCharsets.UTF_8);
            lines.stream().forEach(line -> {
                String[] split = line.split(",");
                if(split.length == TAMANHO_CORRETO_COLUNA) {
                    Livro livro = new LivroFisico(split[POSICAO_TITULO], split[POSICAO_AUTOR], split[POSICAO_EDITORA], Math.random(),
                            Integer.parseInt(split[POSICAO_PAGINA]));
                    livros.add(livro);
                }
            });
        } catch (IOException e) {

            throw new RuntimeException("Não foi possivel ler o arquivo CSV");
        }


        return livros;
    }
}
