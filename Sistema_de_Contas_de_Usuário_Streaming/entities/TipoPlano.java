package Sistema_de_Contas_de_Usuário_Streaming.entities;

public enum TipoPlano {
    PADRAO(30.00),
    PREMIUM(50.00);

    private final double preco;

    TipoPlano(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
