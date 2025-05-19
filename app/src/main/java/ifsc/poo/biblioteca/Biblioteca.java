package ifsc.poo.biblioteca;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    static List<Autor> autores = new LinkedList<>();
    static List<Leitor> leitores = new LinkedList<>();
    static List<Livro> livros = new LinkedList<>();
    static Map<Leitor,List<String>> emprestimos = new LinkedHashMap<>();
    static List<String> datas = new  LinkedList<>();
    

    static void addAutor(Autor autor){

        for(Autor a : autores){
            if(a.getNome().equalsIgnoreCase(autor.getNome())){
                System.out.println("Autor já registrado: " + autor.getNome());
                return;
            }
            
        }
        autores.add(autor);
        System.out.println("Autor adicionado com sucesso: " + autor.getNome());
    }

    static void addLeitor(Leitor leitor){

        for(Leitor l : leitores){
            if(l.getNome().equalsIgnoreCase(leitor.getNome())){
                System.out.println("Leitor já registrado: " + leitor.getNome());
                return;
            }
        }
        leitores.add(leitor);
        System.out.println("Leitor adicionado com sucesso: " + leitor.getNome());

    }

    static void addLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
    }


    static void registraEmprestimos(Livro livro, Leitor leitor, String data){
        if((livro.getQtd() >= 1) && (!leitor.getLivros().contains(livro)) && (leitor.getLivros().size() < 5)){
            leitor.setLivros(livro); //registra o livro na lista de livros desse leitor
            datas.add(data);
            emprestimos.put(leitor, leitor.getDatas());
            System.out.println("Registro feito com sucesso!" + "\nDados do registro: \n" + "Nome do leitor: "  + leitor.getNome() + "\nLivro emprestado: " + livro.getTitulo() + "\nData de empréstimo: " + data);
        }
    }

    static void listaEmprestimosOrdenado(){
        if(!datas.isEmpty()){
            datas.sort(Comparator.comparing(LocalDate::parse));

            System.out.println("Registro de empréstimos por datas: ");
            for (String data : datas) {
                System.out.println("  - " + data);
            }
        }else{
            System.out.println("Sem datas registradas!");
        }
    }


    static void getAutoresOrdenado(){

        if(!autores.isEmpty()){
            List<String> nomeDeAutores = new LinkedList<>();

            for(Autor a: autores){
                nomeDeAutores.add(a.getNome());
            }
            Collections.sort(nomeDeAutores);
            System.out.println(nomeDeAutores);
        }
    }


}
