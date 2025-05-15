package ifsc.poo.login;

public class User {
    private String login, senha;
    final static Register register = new Register(); //todos os usuarios compartilham o mesmo registro

    public User(String login, String senha) {
        if(setLogin(login) && setSenha(senha) && register.addUser(this.login, this.senha)){
            System.out.println("Usuário " + login +" adicionado com sucesso!");
        }else{
            System.out.println("Já existe um usuário com este nome!");
        }
        
    }

    private boolean setLogin(String login){
        login = login.toLowerCase();

        //Para o caso do usuario não entrar com um login
        if(login.isEmpty()){
            return false;
        }
        this.login = login;
        return true;
    }

    private boolean  setSenha(String senha){
        if(senha.isEmpty()){
            return false;
        }
        this.senha = senha;
        return true;
    }

    public String getSenha(){
        return this.senha;
    }

    public String getLogin(){
        return this.login;
    }

    static  void  autenticationUser(String login, String senha){
        if(register.autenticationUser(login, senha)){
            System.out.println("Usuário " + login + " autenticado com sucesso!");
        }else{
            System.out.println("Usuário ou senha inválidos!");
        }
    }

    static void getLogins(){
        register.getUsers();
    }

    static void removeUser(String login){
        if(register.removeUser(login)){
            System.out.println("Usuário " + login + " removido com sucesso!");
        }else{
            System.out.println("Usuário inválido ou inexistente!");
        }
    }

    static boolean  getVazia(){
        if(register.verificaVazio()){
            System.out.println("\n\nNão há usuários cadastrados! Adicione um usuário!\n\n");
            return true;
        }
        return false;
    }
}
