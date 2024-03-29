public class Computador{
    private String marca;
    private double velocidade;
    private int anoFabricacao; 
    private boolean novo;
	
    public Computador(String marca, double velocidade, int anoFabricacao, boolean novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.novo = novo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    public void setNovo(boolean novo){
        this.novo = novo;
    }
    
    public boolean getNovo(){
        return novo;
    }
}