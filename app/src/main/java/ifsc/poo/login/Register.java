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
    static  void removeUser(String login){
        if(usuarios.containsKey(login)){
            usuarios.remove(login);
            System.out.println("Usuário " + login + " removido com sucesso!");
        }else{
             System.out.println("Usuário inválido ou inexistente!");
        }
       
    }

    //Autentica usuários
    static void autenticationUser(String login, String senha){
        login = login.toLowerCase();
       if (usuarios.containsKey(login) && usuarios.get(login).equals(senha)){
        System.out.println("Usuário " + login + " autenticado com sucesso!");
       }else{
         System.out.println("Usuário ou senha inválidos!");
       };
    
    }
    
    static void getUsers(){
        for(String login : usuarios.keySet()){
            System.out.println(login);
        }
    }

    static boolean verificaVazio(){
        if(usuarios.isEmpty()){
             System.out.println("\n\nNão há usuários cadastrados! Adicione um usuário!\n\n");
             return true;
        };
        return false;
    }

    




}
