package br.com.coffeeandit.factory;

import br.com.coffeeandit.datasource.CSVLivros;
import br.com.coffeeandit.datasource.ILivroDataSource;

public class FabricasDeLivros {
    /**
     *
     * @param origemLivrosEnum @see br.com.coffeeandit.factory.OrigemLivrosEnum o tipo da origem da fonte de dados.
     * @return @see br.com.coffeeandit.datasource.ILivroDataSource com o tipo da origem passada por parâmetro.
     * */

    public static ILivroDataSource criarFabricaLivros(final OrigemLivrosEnum origemLivrosEnum) throws IllegalAccessException {
        if(origemLivrosEnum.equals(OrigemLivrosEnum.CSV)){
            return new CSVLivros();
        } else if (origemLivrosEnum.equals(OrigemLivrosEnum.BANCO_DE_DADOS)){
            // TODO Implementar Leitura de Banco de Dados.
            return null;
        }
        throw new IllegalAccessException("Origem de livros não dispopnivel");

    }
}
