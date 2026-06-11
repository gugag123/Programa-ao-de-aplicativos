package Refatorando_Delivery_de_Restaurante.entities;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}
