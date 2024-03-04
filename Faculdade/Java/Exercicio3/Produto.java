public class Produto{
    private String nome, descricao;
    private double valor;
    private int estoque;
    
    
    public Produto(String nome, String descricao, double valor, int estoque){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public double getValor(){
        return valor;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    
}