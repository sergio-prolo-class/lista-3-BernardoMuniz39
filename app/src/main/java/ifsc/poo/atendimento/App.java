package ifsc.poo.atendimento;

public class App {

    public static void main(String[] args) {
        Client c1 = new Client("Bernardo", "Preciso de suporte técnico", "Suporte Técnico", "48991061141");
        Client c2 = new Client("Mariana", "Gostaria de saber mais sobre os serviços", "Informação", "48987452310");
        Client c3 = new Client("Lucas", "Problemas com a fatura deste mês", "Atendimento Financeiro", "48999882211");
        Client c4 = new Client("Fernanda", "Meu sistema está travando constantemente", "Suporte Técnico", "48991345678");
        Client c5 = new Client("Carlos", "Quero atualizar meus dados cadastrais", "Informação", "48991234567");
        Client c6 = new Client("Amanda", "Tenho uma dúvida sobre cobranças", "Atendimento Financeiro", "48991122334");
        Client c7 = new Client("João", "Erro ao tentar acessar minha conta", "Suporte Técnico", "48994561234");
        Client c8 = new Client("Patrícia", "Informações sobre novos planos", "Informação", "48998761234");

        Manager.getNexClient();
        System.out.println("");
        Manager.toMeetNextClient();
        System.out.println("");
        Manager.getPhonesServed();
        System.out.println("");
        Manager.getPhonesWait();
        System.out.println("");
        Manager.getPhonesRegistred();
        System.out.println("");
        Manager.getReport();
       
    }
  
}
