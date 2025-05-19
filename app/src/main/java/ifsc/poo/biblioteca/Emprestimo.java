package ifsc.poo.biblioteca;


public class Emprestimo {
    



    /*Registrar empréstimos de livros para leitores, desde que:
    Haja pelo menos uma cópia disponível do livro.
    O leitor ainda não tenha esse livro emprestado.
    O leitor possua menos de 5 livros emprestados. */
    /*static void registraEmprestimos(Livro livro, Leitor leitor, String data){

        if((Collections.frequency(livros, livro.getCodigo()) >= 1) && (!leitor.getLivros().contains(livro)) && (leitor.getLivros().size() < 5)){
            leitor.setLivros(livro); //registra o livro na lista de livros desse leitor
            datas.add(data);
            emprestimos.put(leitor, leitor.getDatas());
            System.out.println("Registro feito com sucesso!" + "\nDados do registro: \n" + "Nome do leitor: "  + leitor.getNome() + "\nLivro emprestado: " + livro.getTitulo() + "\nData de empréstimo: " + data);
        }
    }


    //Autor: nome, Livros: livro a , livro b
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
    }/* */
}
