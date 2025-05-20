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
            System.out.println("{Autores ordenados por ID}");
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

    static void getLeitorOrdenado(){
        if(!leitores.isEmpty()){
            System.out.println("{Leitores ordenados por ID}");
            for(Leitor l : leitores){
                System.out.println("{id = " + l.getId() + " nome = " + l.getNome() + "}");
            }
            }
        else{
            System.out.println("Lista de leitores vazia!");
        }
    }

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

}
