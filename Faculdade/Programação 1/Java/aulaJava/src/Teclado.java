public class Teclado
{
    private String titulo, autor;
     private int anoPublicacao, quantidadePaginas;
     private double preco;
    
    public Teclado(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getQuantidadePaginas(){
        return quantidadePaginas;
    }
    
    public double calcularPrecoPorPagina(){
        if (quantidadePaginas == 0){
            return 0;
        }
        return preco / quantidadePaginas;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações do Livro:");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("O ano de publicação é: "+anoPublicacao);
        System.out.println("Preço: R$" + preco);
        System.out.println("A quantidades de páginas é: "+quantidadePaginas);
        System.out.println("Preço por Página: R$" +calcularPrecoPorPagina());
    }
    }