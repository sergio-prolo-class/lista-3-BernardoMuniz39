package ifsc.poo.biblioteca;

import java.util.LinkedList;
import java.util.List;

public class Livro {
    private int qtd = 0; //Quantidade desse livro
    private String titulo, codigo;
    final List<Autor> autores = new LinkedList<>();
    static int qtdlivros = 0; //quantidade de livros totais

    public Livro(String titulo, Autor... autores) {
        if(setTitulo(titulo)){
            qtd++;
            qtdlivros++;
            this.codigo = String.format("ISBN%03d", qtdlivros);
        }

        for (Autor autor : autores) {
            adicionarAutor(autor);
        }
    }

    private boolean  setTitulo (String titulo){
        if(titulo.equals("") || titulo.isEmpty()){
            System.out.println("Título inválido!");
            return false;
        }
        this.titulo = titulo;
        return true;
    }

    public void adicionarAutor(Autor autor){
        autores.add(autor);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public List<Autor> getAutores(){
        return autores;
    }

    public int getQtd(){
        return this.qtd;
    }

    public int getQtdLivros(){
        return qtdlivros;
    }

    
}
