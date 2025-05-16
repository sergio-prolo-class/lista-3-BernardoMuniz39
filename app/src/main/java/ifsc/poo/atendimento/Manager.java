package ifsc.poo.atendimento;

import java.util.LinkedList;
import java.util.Queue;

public class Manager {
    static Queue<Client> fila = new LinkedList<>();

    static void addClient(Client client, String name, String description, String category, String phone){
        fila.add(new Client(name, description, category, phone));
    }
}
