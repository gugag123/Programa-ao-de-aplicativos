package Java_TryCatch_ClassFinal_ClassAbstract.Refatorando_Delivery_de_Restaurante.entities;

public final class Pix extends Pagamento {
    public Pix() {
        super(TipoPagamento.PIX);
    }

    @Override
    public void processar() {
        System.out.println("Gerando chave Pix ");
    }
}
