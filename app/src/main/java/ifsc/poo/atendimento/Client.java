package ifsc.poo.atendimento;

public class Client {
    private String name, description, category, phone;

    public Client(String name, String description, String category, String phone) {
        if(setName(name) && setDescription(description) && setCategory(category) && setPhone(phone)){
            Manager.addClient(this, name, description, category, phone);
        }
    }

    

    private boolean setName(String name){
        if(name.equals("") || name.isEmpty()){
            System.out.println("Nome inválido");
            return false;
        }
        this.name = name;
        return true;
    }

    private boolean setDescription(String description){
           if(description.equals("") || description.isEmpty()){
            System.out.println("Descrição inválida");
            return false;
        }
        this.description = description;
        return true;
    }

    private boolean setCategory(String category){
        switch (category) {
            case "Suporte Técnico":
            case "Informação":
            case "Atendimento Financeiro":
            this.category = category;
                return true;
            default:
                System.out.println("Categoria inválida!");
                return false;
        }
    }

    private boolean setPhone(String phone){
        if(phone.equals("") || phone.isEmpty()){
            System.out.println("Telefone inválido");
            return false;
        }
        this.phone = phone;
        return true;
    }



}
