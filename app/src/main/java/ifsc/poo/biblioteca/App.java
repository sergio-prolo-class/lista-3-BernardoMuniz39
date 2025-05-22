package ifsc.poo.biblioteca;

public class App {
    public static void main(String[] args) {
        Autor a1 = new Autor("Machado de Assis", "Português");
        Autor a2 = new Autor("George Orwell", "Inglês");
        Autor a3 = new Autor("Gabriel García Márquez", "Espanhol");
        Autor a4 = new Autor("Haruki Murakami", "Japonês");
        Autor a5 = new Autor("Franz Kafka", "Alemão");

        Livro l1 = new Livro("Senhor dos Anéis", "ISBN001", a1);
        Livro l2 = new Livro("teste", "ISBN001", a1, a2);
        Livro l3 = new Livro("A Metamorfose", "ISBN005", a5);
        Livro l4 = new Livro("1984", "ISBN006", a3);
        Livro l5 = new Livro("Dom Quixote", "ISBN007", a4, a2);
        Livro l6 = new Livro("Cem Anos de Solidão", "ISBN008", a5);
        Livro l7 = new Livro("Orgulho e Preconceito", "ISBN009", a5);

        Leitor L1 = new Leitor("Benardo", "Rua José Francisco Junkes", "48991061141");
        Leitor L2  = new Leitor("Germano", "Rua José Francisco Junkes", "48991061141");
        Leitor L3 = new Leitor("Ygor", "Rua José Francisco Junkes", "48991061141");

        Biblioteca.addAutor(a1,a2,a3,a4,a5);
        Biblioteca.addLivro(l1);
        Biblioteca.addLivro(l2);
        Biblioteca.addLivro(l3);
        Biblioteca.addLivro(l4);
        Biblioteca.addLivro(l5);
        Biblioteca.addLivro(l6);
         Biblioteca.addLivro(l7);
        Biblioteca.addLeitor(L1);
        Biblioteca.addLeitor(L2);
        Biblioteca.addLeitor(L3);


        Biblioteca.getAutorOrdenado();
        System.out.println("");
        Biblioteca.getLeitorOrdenado();
        System.out.println("");
        Biblioteca.getLivrosOrdenado();
        System.out.println("");

        Emprestimo.registraEmprestimos(l1, L3, "15/01/2006");
        Emprestimo.registraEmprestimos(l2, L3, "22/03/2007");
        Emprestimo.registraEmprestimos(l3, L3, "05/07/2008");
        Emprestimo.registraEmprestimos(l4, L3, "12/11/2009");
        Emprestimo.registraEmprestimos(l6, L3, "28/08/2010");
        Emprestimo.registraEmprestimos(l6, L3, "28/08/2010");
        Emprestimo.listarEmprestimos(L3);

        
    }
}