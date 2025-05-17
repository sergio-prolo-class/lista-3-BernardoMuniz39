package ifsc.poo.atendimento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Manager {
    static Queue<Client> registrados = new LinkedList<>(); //fila de todos os clientes ja registrados
    static Queue<Client> fila = new LinkedList<>(); //fila real que será atendida e terá remoção de clientes
    static List<Client> atendidos = new ArrayList<>();//LIsta de clientes atendidos

    //Registrar novas solicitações de atendimento, vinculadas ao nome e telefone do cliente.
    static void addClient(Client client){
        registrados.add(client);
        fila.add(client);
    }

    //Listar os telefones de todos os clientes já registrados.
    static void getPhonesRegistred(){

        if(!registrados.isEmpty()){
            System.out.println("Telefones de todos os clientes registrados:");
            for(Client C : registrados){
            System.out.println(C.getPhone());
        }
        }else{
            System.out.println("Fila vazia!");
        }
        
    }

    //Imprimir o nome do próximo cliente da fila.
    static void getNexClient(){
        if(!fila.isEmpty()){
            Client C = fila.peek();
            System.out.println("Próximo cliente da fila: " + C.getName());
        }else{
            System.out.println("Fila vazia!");
        }
    }

    //Atender o próximo cliente da fila.
    static void toMeetNextClient(){
        if(!fila.isEmpty()){
            Client C = fila.poll();
            System.out.println("Atendendo o próximo cliente da fila: " + C.getName());
            atendidos.add(C);

        }else{
            System.out.println("Fila vazia!");
        }
    }

    //Listar os nomes dos clientes já atendidos
    static void getPhonesServed(){
        if(!atendidos.isEmpty()){
            System.out.println("Telefones de todos os clientes atendidos:");
            for(Client C : atendidos){
            System.out.println(C.getPhone());
        }
        }else{
            System.out.println("Nenhum cliente foi atendido");
        }
    }

    static void getPhonesWait(){
        if(!fila.isEmpty()){
            System.out.println("Telefones de todos os clientes em espera:");
            for(Client C : fila){
            System.out.println(C.getPhone());
        }
        }else{
            System.out.println("Nenhum cliente em espera!");
        }
    }

    static void getReport(){
        int sup = 0, financeiro = 0, info = 0;
        //Total de solicitações registradas, atendidas e em espera
        System.out.println("Solicitações registradas: " + registrados.size() + "\nClientes atendidos: " + atendidos.size() + "\nClientes em espera: " + fila.size());

        for(Client C : registrados){
            if(C.getCategory().equals("Suporte Técnico")){
                sup++;
            }else if(C.getCategory().equals("Informação")){
                info++;
            }else{
                financeiro++;
            }
    }

    //Percentual
        double percentsup = (sup * 100.0) / registrados.size();
        double percentinfo = (info * 100.0) / registrados.size();
        double percentfinan = (financeiro * 100.0) / registrados.size();

        System.out.println("Categoria: Suporte Técnico          Percentual: " + percentsup + "%");
        System.out.println("Categoria: Informação               Percentual: " + percentinfo + "%");
        System.out.println("Categoria: Atendimento Financeiro   Percentual: " + percentfinan + "%");


    
}
}
