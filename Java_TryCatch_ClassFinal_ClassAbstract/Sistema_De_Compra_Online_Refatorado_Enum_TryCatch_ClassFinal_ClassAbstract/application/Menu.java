package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.application;

import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.Cliente;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.Compra;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.FormaDePagamento;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.Recibo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static int numeroPedidoAtual = 1;

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Compra Online");

        // Dados do cliente
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Endereco: ");
        String endereco = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);

        System.out.println("\n--- Dados cadastrados ---");
        cliente.exibirDados();

        // Forma de pagamento
        FormaDePagamento pagamento = escolherPagamento(sc);

        // Produtos
        System.out.println("\n--- Adicionar Produtos ---");
        Compra compra = new Compra(cliente, pagamento);
        compra.adicionarProdutos(sc);

        // Recibo
        Recibo recibo = new Recibo(
                numeroPedidoAtual++,
                compra.getTotalComFrete(),
                pagamento,
                cliente.getNome()
        );
        recibo.imprimirRecibo();
    }

    private static FormaDePagamento escolherPagamento(Scanner sc) {
        while (true) {
            try {
                System.out.println("\nEscolha a forma de pagamento:");
                System.out.println("1 - CARTAO");
                System.out.println("2 - PIX");
                System.out.println("3 - BOLETO");
                System.out.println("4 - DINHEIRO");
                System.out.print("Opcao: ");

                int opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1: return FormaDePagamento.CARTAO;
                    case 2: return FormaDePagamento.PIX;
                    case 3: return FormaDePagamento.BOLETO;
                    case 4: return FormaDePagamento.DINHEIRO;
                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros inteiros.");
                sc.nextLine(); // Limpa o buffer no erro
            }
        }
    }
}