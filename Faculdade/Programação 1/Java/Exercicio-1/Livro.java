public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int quantidadePaginas;
    
    public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getanoPublicacao(){
        return anoPublicacao;
    }
}
