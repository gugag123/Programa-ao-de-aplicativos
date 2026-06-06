package Sistema_De_Controle_Online_Refatorado_Enum.entities;

import java.util.Scanner;

public class compra {
    private String nome;
    private String cpf;
    private String endereco;
    private String pagamento;

    private double total = 0;
    private double frete = 0;

    public void adicionarProdutos() {

        Scanner sc = new Scanner(System.in);

        String continuar;

        do {

            System.out.print("Digite o valor do produto: ");
            double valorProduto = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            total = total + (valorProduto * quantidade);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public void dadosCliente() {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        endereco = sc.nextLine();

        System.out.print("Forma de pagamento:");
        System.out.println("1 - CARTAO");
        System.out.println("2 - PIX");
        System.out.println("3 - BOLETO");
        System.out.println("4 - DINHEIRO");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                pagamento = String.valueOf(FormaPagamento.CARTAO);
                break;
            case 2:
                pagamento = String.valueOf(FormaPagamento.PIX);
                break;
            case 3:
                pagamento = String.valueOf(FormaPagamento.BOLETO);
                break;
            case 4:
                pagamento = String.valueOf(FormaPagamento.DINHEIRO);
                break;
            default:
                System.out.println("Opção inválida.");
        }

}

public void calcularFrete() {

    if (total > 500) {

        System.out.println("Frete grátis!");

    } else {

        frete = 25;
        total = total + frete;

        System.out.println("Frete de R$25 adicionado.");
    }

    System.out.println("Valor total: R$ " + total);
}

public void finalizarCompra() {

    Scanner sc = new Scanner(System.in);

    System.out.print("forma de pagamento aprovado? (s/n): ");
    String aprovado = sc.next();

    if (aprovado.equalsIgnoreCase("s")) {

        int numeroPedido;

        numeroPedido = (int) (Math.random() * 1000);

        System.out.println("Número do pedido: " + numeroPedido);

        System.out.println("Compra registrada.");
        System.out.println("Confirmação enviada.");
        System.out.println("Compra realizada com sucesso.");

    } else {

        System.out.println("Pagamento não autorizado.");
    }
}
}