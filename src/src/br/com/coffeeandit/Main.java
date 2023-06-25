package br.com.coffeeandit;

import br.com.coffeeandit.digital.LivroDigital;
import br.com.coffeeandit.excecao.CalculonotFounException;
import br.com.coffeeandit.fisico.LivroFisico;
import br.com.coffeeandit.livro.CalcularDesconto;
import br.com.coffeeandit.livro.CalcularReajuste;
import br.com.coffeeandit.livro.Calculos;
import br.com.coffeeandit.livro.Livro;

import java.util.Scanner;

public class Main {
    public static final double INDICE_AUMENTO = 0.1;
    public static final double INDICE_REDUCAO = 0.1;

    public static int lerTeclado() throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.next();
        return Integer.parseInt(opcao);

    }

    public static void main(String[] args) {

        //FIXME Alterar a interface do usuário para solicitar pesquisas de livros ou calculo de reajuste.

        System.out.println("Olá usuário");
        System.out.println("Digite 1 -> para reajuste / Digite 2 -> para desconto");
        try {
        int opcao = lerTeclado();

        Calculos calculo = null;

        if(opcao == 1){
            calculo = new CalcularReajuste();
        } else if(opcao == 2){
            calculo = new CalcularDesconto();
        }
        if(calculo != null) {

            Livro livroFisico = new LivroFisico("O Silmarillion", "J. R. R. Tolkien", "Capa dura", 33d, 560);


            System.out.println("O preço do livroFisico " + livroFisico.getTitulo() + " era de " + livroFisico.getPreco());

            if(opcao == 1){
                calculo.aumentarPreco(livroFisico, INDICE_AUMENTO);

            } else{
                calculo.diminuirPreco(livroFisico, INDICE_REDUCAO);
            }

            System.out.println("O preço do livroDigital " + livroFisico.getTitulo() + " e de " + livroFisico.getPreco());

        }
           // throw  new CalculonotFounException("A aplicação não está preparada para esse cálculo.");
        }catch (NumberFormatException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());
            System.exit(0);
        };


    }
}