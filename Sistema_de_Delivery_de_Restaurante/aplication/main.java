package Sistema_de_Delivery_de_Restaurante.aplication;

import Sistema_de_Delivery_de_Restaurante.entities.Autenticador;
import Sistema_de_Delivery_de_Restaurante.entities.Pagamento;
import Sistema_de_Delivery_de_Restaurante.entities.Produto;
import Sistema_de_Delivery_de_Restaurante.entities.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Usuario usuario = new Usuario("carlos@email.com", "123456");
        Autenticador autenticador = new Autenticador(usuario);
        System.out.println("login:");
        String login = texto.nextLine();
        System.out.println("senha:");
        String senha = texto.nextLine();
        if (autenticador.autenticar(login, senha)) {
            System.out.println("Login autenticado com sucesso");
            ArrayList<Produto> cardapio = new ArrayList<>();
            cardapio.add(new Produto(1, " torta de maça ", 43.87));
            cardapio.add(new Produto(2, " Strogonoff ", 25.52));
            cardapio.add(new Produto(3, " bolo ", 8.37));
            cardapio.add(new Produto(4, " hambúrguer ", 35.90));

            ArrayList<Produto> carrinho = new ArrayList<>();
            int opcao;
            do {
                System.out.println("\n====cardapio====");

                for (Produto produto : cardapio) {
                    System.out.println(produto.getCodigo() + ""
                            + produto.getNome() + ""
                            + produto.getPreco());
                }

                System.out.println("0 para finalizar compra");
                System.out.println("Escolha um produto:");
                opcao = texto.nextInt();
                for (Produto produto : cardapio) {
                    if (produto.getCodigo() == opcao) {
                        carrinho.add(produto);
                        System.out.println(produto.getNome() + "adicionado ao carrinho ;)");
                    }
                }
            } while (opcao != 0);
            boolean pagamentoAprovado = true;
            if (!pagamentoAprovado) {
                System.out.println("pagamento não autorizado.");
            } else {

                int numeroPedido=(int) (Math.random()* 10000);

                System.out.println("\nforma de pagamento:");
                System.out.println("1 = pix");
                System.out.println("2 = dinheiro");
                System.out.println("3 = cartão");
                int forma = texto.nextInt();

                Pagamento pagamento;

                switch (forma) {
                    case 1 -> pagamento = Pagamento.PIX;
                    case 2 -> pagamento = Pagamento.DINHEIRO;
                    case 3 -> pagamento = Pagamento.CARTAO;
                    default -> pagamento = Pagamento.PIX;
                }
                double total = 0;
                System.out.println("\nprodutos comprados: ");
                for (Produto produto : carrinho) {
                    System.out.println("- " + produto.getNome());
                    total += produto.getPreco();
                }
                System.out.println("Total de compras: " + total);

                double taxaEntrega;
                if (total < 50) {
                    taxaEntrega = 8.0;
                } else {
                    taxaEntrega = 0.0;
                }
                double totalFinal = total + taxaEntrega;
                System.out.println("pagamento aprovado!");
                System.out.println("numero do pedido: " + numeroPedido);
                System.out.println("pedido registrado");
                System.out.println("taxa de entrega: R$" + taxaEntrega);
                System.out.println("total final: R$" + totalFinal);
                System.out.println("pagamento: " + pagamento);
                System.out.println("pedido realizado com sucesso");
                System.out.println("enviando o pedido para a cozinha...");
            }
        } else {
            System.out.println("Login ou senha invalido");
        }
    }
}
