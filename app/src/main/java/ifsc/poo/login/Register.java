package ifsc.poo.login;

import java.util.LinkedHashMap;
import java.util.Map;

public class Register {
    public static Map<String, String> usuarios = new LinkedHashMap<>();

    //Cadastra novos usuários a partir do login e senha, garantindo que logins não se repitam
    public boolean addUser(String login, String senha){

        if(!usuarios.containsKey(login)){
            usuarios.put(login, senha);
            return true;
        }
         return false;
        }
    
    //Remove usuários com base em seu login
    public boolean removeUser(String login){
        if(usuarios.containsKey(login)){
            usuarios.remove(login);
            return true;
        }
        return false;
    }

    //Autentica usuários
    public boolean autenticationUser(String login, String senha){

        return usuarios.containsKey(login) && usuarios.get(login).equals(senha);
    
    }
    
    public void getUsers(){
        for(String login : usuarios.keySet()){
            System.out.println(login);
        }
    }

    public boolean verificaVazio(){
        return usuarios.isEmpty();
    }




}
