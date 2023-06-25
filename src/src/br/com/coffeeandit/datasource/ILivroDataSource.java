package br.com.coffeeandit.datasource;

import br.com.coffeeandit.livro.Livro;

import java.util.List;

/**
 * @version 1.0
 * @Author Augusto Alves
 * @since 24/06/23
 *
 */

public interface ILivroDataSource {

    /**
     * Este método é responsavel por buscar livros de diferentes origens.
     *
     * @return java.util.List de @see br.com.coffeeandit.livro..livro
     */

    List<Livro> buscarLivros() throws RuntimeException;


}
