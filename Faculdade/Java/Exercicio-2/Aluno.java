public class Aluno
{
    private String nome, matricula;
    private double grauA, grauB;
    
    public Aluno(String nome, String matricula, double grauA, double grauB){
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setGrauA(double grauA){
        this.grauA = grauA;
    }
    
    public void setGrauB(double grauB){
        this.grauB = grauB;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getGrauA(){
        return grauA;
    }
    
    public double getNotaGB(){
        return grauB;
    }
    
    public double calculaMediaFinal(){
        return (grauA * 0.33) + (grauB * 0.67);
    }
    
    public void imprimeInfo(){
        System.out.println("Aluno: "+nome);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Nota do GA: "+grauA);
        System.out.println("Nota do GB: "+grauB);
        System.out.println("Média final: "+calculaMediaFinal());
    }
    
}
