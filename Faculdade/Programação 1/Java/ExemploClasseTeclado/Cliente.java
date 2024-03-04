public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    
    public Cliente(String nome, int idade, char sexo, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Seu nome é: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Endereço de e-mail: "+email);
        System.out.println("Sua senha é: "+senha);
    }
}