public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;



    public Cliente(String cpf, String nome, String telefone, String email){
        if(!setCpf(cpf)){
            System.out.println("Cpf invalido");
        }
        if (!setNome(nome)) {
            System.out.println("Nome einvalido");
        }
        if (!setTelefone(telefone)) {
            System.out.println("Telefone invalido");
        }
        if (!setEmail(email)) {
            System.out.println("Email einvalido");
        }
    }

    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }


    public boolean setCpf(String cpf){
        if(cpf == null || cpf.trim().isEmpty()){
            return false;
        }
        this.cpf = cpf;
        return true;
    }
    public boolean SetNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            return false;
        }
        this.nome = nome;
        return true;
    }
    public boolean setTelefone(String telefone){
        if(telefone == null || telefone.trim().isEmpty()){
            return false;
        }
        this.telefone = telefone;
        return true;
    }
    public boolean setEmail(String email){
        if(email == null || email.trim().isEmpty()){
            return false;
        }
        this.email = email; 
        return true;      
    }

}

    



