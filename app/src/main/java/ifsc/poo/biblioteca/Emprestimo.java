package ifsc.poo.biblioteca;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Emprestimo  {
    static  Map<Leitor, List<String>> datasPorLeitor = new HashMap<>();

    //Registrar empréstimos de livros para leitores
    static void registraEmprestimos(Livro livro, Leitor leitor, String data){
        //verificar isso aq dps
        long qtd = Biblioteca.getListLivros().stream().filter(l -> l.getCodigo().equals(livro.getCodigo())).count();
        long qtdCopias = Collections.frequency(Biblioteca.getListLivros(), livro.getCodigo()); //Definindo a quantidade de cópias do livro a ser emprestado
        boolean emprestado = leitor.getLivros().contains(livro); //Verifica se o leitor ja possui o livro emprestado
        int qtdLivrosEmprestados = leitor.getLivros().size(); //Verifica a quantidade de livros emprestados que um leitor possui

            if((qtdCopias >= 1) && (!emprestado) && (qtdLivrosEmprestados < 5)){
                leitor.setLivros(livro); //registra o livro na lista de livros do leitor

                if(!datasPorLeitor.containsKey(leitor)){ //Verifica se o leitor ja está presente no mapa
                    datasPorLeitor.put(leitor, new LinkedList<>());//Se o leitor não estiver presente no mapa, cria uma novo par chave - valor e 
                }
                datasPorLeitor.get(leitor).add(data); //Adiciona no hashmap a data associada ao cliente

                  System.out.println("Empréstimo registrado com sucesso para " + leitor.getNome() + " na data " + data);
        } else {
                System.out.println("Leitor não possui os requisitos para pegar um livro emprestado!");
            }
    }

    
    //Listar as datas de um leitor específico
    static void listarEmprestimos(Leitor leitor){
        if(!datasPorLeitor.get(leitor).isEmpty()){
            List<String> datas = datasPorLeitor.get(leitor);

            System.out.println("Listando as datas de empréstimo de " + leitor.getNome());
        
            for(String data : datas){
                System.out.println("- " + data);
            }
        }else{
            System.out.println("Leitor não possui datas de empréstimo!");
        }
    }

}
