package ifsc.poo.biblioteca;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    static List<Autor> autores = new LinkedList<>();
    static List<Leitor> leitores = new LinkedList<>();
    static List<Livro> livros = new LinkedList<>();
    //Adiciona um novo autor
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

    //Adiciona um novo autor
    static void addLeitor(Leitor leitor){
        leitores.add(leitor); //Adiciona um novo autor 
        leitor.setId(leitores.size()); //Cria um ID na hora do cadastro
        System.out.println("Leitor adicionado com sucesso: " + leitor.getNome());

    }

    static void getAutorOrdenado(){
        if(!autores.isEmpty()){
            List<String> nomesAutores = new LinkedList<>();

            for(Autor a : autores){
                nomesAutores.add(a.getNome());
            }

            Collections.sort(nomesAutores);

            for(String s : nomesAutores){
                System.out.println("- " + s + " ;");
            }
        }else{
            System.out.println("Lista de autores vazia!");
        }
    }

    private String formatID(List<Integer> ids){
        String id = new String();

        for(int i = 0; i < ids.size(); i++){
            if(i == ids.size()){
                id += ids.get(i) + ".";
                break;
            }
            id += ids.get(i) + ", ";
        }
        return id;
    }


    private String formatName(List<String> names){
        String name = new String();

        for(int i = 0; i < names.size(); i++){
            if(i == names.size()){
                name += names.get(i) + ".";
                break;
            }
            name += names.get(i) + ", ";
        }
        return name;
    }

    static void getLeitorOrdenado(){
        if(!leitores.isEmpty()){
            for(Leitor l : leitores){
                List<Integer> id = new LinkedList<>();
                List<String> nomesLeitores = new LinkedList<>();

                 for(Leitor a : leitores){
                   id.add(a.getId());
                }

                for(Leitor a : leitores){
                   nomesLeitores.add(a.getNome());
                }

                Collections.sort(id);
                Collections.sort(nomesLeitores);
                
                System.out.println("Leitor: " + l.getNome());
                
            }
        }else{
            System.out.println("Lista de leitores vazia!");
        }
    }

    //Adiciona um novo livro
    static void addLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
    }

    static List<Livro> getListLivros(){
        return livros;
    }

    static List<Autor> getListAutores(){
        return autores;
    }

    static List<Leitor> getLeitores(){
        return leitores;
    }


    /*
    Listar: 
       - Autores, em ordem alfabética.
       - Leitores, em ordem alfabética e por id.
       - Livros, ordenados por título, por autor e por ISBN.
       - Empréstimos, por data.
       - Empréstimos de um leitor específico, por data.
    */

}
