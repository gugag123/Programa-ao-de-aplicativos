package Refatorando_Delivery_de_Restaurante.entities;

public final class Dinheiro extends Pagamento {
    public Dinheiro() {
        super(TipoPagamento.DINHEIRO);
    }

    @Override
    public void processar() {
        System.out.println("Separe o valor em dinheiro. O entregador levará troco se necessário");
    }
}
