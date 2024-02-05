public class PrincipalAluno
{
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno("Brandamente Brasil", "1585248", 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);
        
        System.out.println("Informações do aluno 1");
        aluno1.imprimeInfo();
        System.out.println("\nInformações do aluno 2");
        aluno2.imprimeInfo();
        System.out.println("\nInformações do aluno 3");
        aluno3.imprimeInfo();
        
        aluno2.setGrauA(9);
        
        System.out.println("\nMedia final do Radingunda após alteração: "+aluno2.calculaMediaFinal());
        
        System.out.println("\nMatricula de Vitimado: "+aluno3.getMatricula());
        
        aluno1.setMatricula("1585228");
        
        aluno2.setGrauB(Teclado.leDouble("Informe a nova nota do GB: "));
        
        System.out.println("Informações do aluno 1");
        aluno1.imprimeInfo();
        System.out.println("\nInformações do aluno 2");
        aluno2.imprimeInfo();
        System.out.println("\nInformações do aluno 3");
        aluno3.imprimeInfo();
    }
}
