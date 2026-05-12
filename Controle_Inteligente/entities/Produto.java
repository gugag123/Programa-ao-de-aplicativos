package Controle_Inteligente.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public double valorTotalEstoque(){
        return preco*quantidadeEstoque;
    }
    public void adicionarProduto(int quantidade){
        quantidadeEstoque += quantidade;
    }
    public void removerProduto(int quantidade){
        quantidadeEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome = '" + nome + '\'' +
                ", preço = " + preco +
                ", quantidadeEstoque = " + quantidadeEstoque +
                '}';
    }
}
