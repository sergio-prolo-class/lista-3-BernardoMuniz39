package ifsc.poo.login;

public class User {
    private String login, senha;
    final static Register register = new Register(); //todos os usuarios compartilham o mesmo registro

    public User(String login, String senha) {
        if(setLogin(login) && setSenha(senha) && register.addUser(this.login, this.senha)){
            System.out.println("Usuário " + login + " adicionado com sucesso!");
            
        }else{
            System.out.println("Já existe um usuário com este nome!");
        }
        
    }

    private boolean setLogin(String login){
        login = login.toLowerCase();

        //Para o caso do usuario não entrar com um login
        if(login.isEmpty()){
            System.out.println("Usuário inválido!");
            return false;
        }
        this.login = login;
        return true;
    }

    private boolean  setSenha(String senha){
        if(senha.isEmpty()){
             System.out.println("Senha inválida!");
            return false;
        }
        this.senha = senha;
        return true;
    }

    public String getSenha(){
        return this.senha;
    }



}
