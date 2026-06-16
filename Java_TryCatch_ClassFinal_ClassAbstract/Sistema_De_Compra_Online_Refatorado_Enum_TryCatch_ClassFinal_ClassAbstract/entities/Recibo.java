package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Recibo {

    private int numeroPedido;
    private double total;
    private FormaDePagamento pagamento;
    private String nomeCliente;

    public Recibo(int numeroPedido, double total, FormaDePagamento pagamento, String nomeCliente) {
        this.numeroPedido = numeroPedido;
        this.total = total;
        this.pagamento = pagamento;
        this.nomeCliente = nomeCliente;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo");
        System.out.println("Pedido N.: " + numeroPedido);
        System.out.println("Cliente:   " + nomeCliente);
        System.out.println("Pagamento: " + pagamento);
        System.out.printf("Total:     R$ %.2f\n", total); // Corrigido aqui
        System.out.println("=========================================\n");
    }
}