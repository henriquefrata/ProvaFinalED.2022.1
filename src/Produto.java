
public class Produto {
    
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(int id, String nome, double preco, int estoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void estoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public int estoque() {
        return estoque;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "-----Produto-----\nCódigo: " + this.id + 
                                "\nNome: " + this.nome + 
                                "\nPreço: " + this.preco +
                                "\nQuantidade em estoque: " + this.estoque;
    }
    
}
