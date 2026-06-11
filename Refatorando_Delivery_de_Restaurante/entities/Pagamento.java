package Refatorando_Delivery_de_Restaurante.entities;

public abstract class Pagamento {
    private TipoPagamento tipo;

    public Pagamento(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public abstract void processar();

    @Override
    public String toString() {
        return this.tipo.name();
    }
}
