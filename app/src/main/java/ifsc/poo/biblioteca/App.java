package ifsc.poo.biblioteca;

public class App {
    public static void main(String[] args) {
        Autor a1 = new Autor("Machado de Assis", "Português");
        Autor a2 = new Autor("George Orwell", "Inglês");
        Autor a3 = new Autor("Gabriel García Márquez", "Espanhol");
        Autor a4 = new Autor("Haruki Murakami", "Japonês");
        Autor a5 = new Autor("Franz Kafka", "Alemão");

        Biblioteca.addLivro(new Livro("Senhor dos Anéis", "ISBN001", a1));
        Biblioteca.addLivro(new Livro("1984", "ISBN002", a2));
        Biblioteca.addLivro(new Livro("Cem Anos de Solidão", "ISBN003", a3));
        Biblioteca.addLivro(new Livro("Kafka à Beira-Mar", "ISBN004", a4));
        Biblioteca.addLivro(new Livro("A Metamorfose", "ISBN005", a5));
        Biblioteca.addLivro(new Livro("Ensaio sobre o Realismo Fantástico", "ISBN006", a1, a3));
        Biblioteca.addLivro(new Livro("Distopias e Realidade", "ISBN007", a2, a5));
        Biblioteca.addLivro(new Livro("O Estrangeiro do Oriente", "ISBN008", a4, a1));

        Biblioteca.addAutor(a1,a2,a3,a4,a5);
        Biblioteca.getAutorOrdenado();
        Biblioteca.getLeitorOrdenado();

        
        
    }
}