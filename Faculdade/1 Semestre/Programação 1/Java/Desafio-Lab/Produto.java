public class Produto {
    private String nome;
    private double preco;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString para exibir informações do produto
    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreço: R$" + String.format("%.2f", preco);
    }
}
