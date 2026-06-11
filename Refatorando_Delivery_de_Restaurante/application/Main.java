package Refatorando_Delivery_de_Restaurante.application;

import Refatorando_Delivery_de_Restaurante.entities.Autenticador;
import Refatorando_Delivery_de_Restaurante.entities.Pagamento;
import Refatorando_Delivery_de_Restaurante.entities.Pix;
import Refatorando_Delivery_de_Restaurante.entities.Dinheiro;
import Refatorando_Delivery_de_Restaurante.entities.Cartao;
import Refatorando_Delivery_de_Restaurante.entities.Produto;
import Refatorando_Delivery_de_Restaurante.entities.Usuario;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario("carlos@gmail.com", "123456");
        Autenticador autenticador = new Autenticador(usuario);

        System.out.println("Digite seu e-mail:");
        String emailInput = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senhaInput = sc.nextLine();

        if (autenticador.autenticar(emailInput, senhaInput)) {
            System.out.println("Login autenticado com sucesso");
            ArrayList<Produto> cardapio = new ArrayList<>();
            cardapio.add(new Produto(1, " torta de maça ", 43.87));
            cardapio.add(new Produto(2, " Strogonoff ", 25.52));
            cardapio.add(new Produto(3, " bolo ", 8.37));
            cardapio.add(new Produto(4, " hambúrguer ", 35.90));

            ArrayList<Produto> carrinho = new ArrayList<>();
            int opcao;

            try {
                do {
                    System.out.println("\n====cardapio====");
                    for (Produto produto : cardapio) {
                        System.out.println(produto.getCodigo() + "" + produto.getNome() + "" + produto.getPreco());
                    }
                    System.out.println("0 para finalizar compra");
                    System.out.println("Escolha um produto:");
                    opcao = sc.nextInt();

                    for (Produto produto : cardapio) {
                        if (produto.getCodigo() == opcao) {
                            carrinho.add(produto);
                            System.out.println(produto.getNome() + "adicionado ao carrinho ;)");
                        }
                    }
                } while (opcao != 0);

                if (carrinho.isEmpty()) {
                    System.out.println("Carrinho vazio. Sistema encerrado.");
                    sc.close();
                    return;
                }

                boolean pagamentoAprovado = true;

                if (!pagamentoAprovado) {
                    System.out.println("pagamento não autorizado.");
                } else {
                    int numeroPedido = (int) (Math.random() * 10000);

                    System.out.println("\nforma de pagamento:");
                    System.out.println("1 = pix");
                    System.out.println("2 = dinheiro");
                    System.out.println("3 = cartão");
                    int forma = sc.nextInt();

                    Pagamento pagamento;

                    switch (forma) {
                        case 1 -> pagamento = new Pix();
                        case 2 -> pagamento = new Dinheiro();
                        case 3 -> pagamento = new Cartao();
                        default -> {
                            System.out.println("Opção inválida. Definindo padrão como Pix.");
                            pagamento = new Pix();
                        }
                    }

                    double total = 0;
                    System.out.println("\nprodutos comprados: ");
                    for (Produto produto : carrinho) {
                        System.out.println("- " + produto.getNome());
                        total += produto.getPreco();
                    }
                    System.out.println("Total de compras: " + total);

                    double taxaEntrega = (total < 50) ? 8.0 : 0.0;
                    double totalFinal = total + taxaEntrega;

                    System.out.println("pagamento aprovado!");
                    pagamento.processar();
                    System.out.println("numero do pedido: " + numeroPedido);
                    System.out.println("pedido registrado");
                    System.out.println("taxa de entrega: R$" + taxaEntrega);
                    System.out.println("total final: R$" + totalFinal);
                    System.out.println("pagamento: " + pagamento);
                    System.out.println("pedido realizado com sucesso");
                    System.out.println("enviando o pedido para a cozinha...");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n[ERRO]: Entrada inválida! Digite apenas números nas opções de escolha.");
            } finally {
                sc.close();
            }

        } else {
            System.out.println("E-mail ou senha inválidos");
            sc.close();
        }
    }
}