package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {

    private Cliente cliente;
    private FormaDePagamento pagamento;
    private double total = 0;
    private double frete = 0;

    public Compra(Cliente cliente, FormaDePagamento pagamento) {
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    private int lerInteiro(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                int valor = sc.nextInt();
                sc.nextLine(); // Limpa o buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros inteiros.");
                sc.nextLine(); // Limpa o buffer no erro
            }
        }
    }

    private double lerDouble(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                double valor = sc.nextDouble();
                sc.nextLine(); // Limpa o buffer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros.");
                sc.nextLine(); // Limpa o buffer no erro
            }
        }
    }

    public void adicionarProdutos(Scanner sc) {
        String continuar;

        do {
            double valorProduto = lerDouble(sc, "Digite o valor do produto: ");
            int quantidade = lerInteiro(sc, "Digite a quantidade: ");

            total += valorProduto * quantidade;

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = sc.nextLine().trim().toLowerCase();

        } while (continuar.equals("s"));

        calcularFrete();

        System.out.printf("%nSubtotal: R$ %.2f%n", total);
        System.out.printf("Frete:    R$ %.2f%n", frete);
        System.out.printf("Total:    R$ %.2f%n", getTotalComFrete());
    }

    private void calcularFrete() {
        if (total < 100.0) {
            frete = 20.0;
        } else if (total < 300.0) {
            frete = 10.0;
        } else {
            frete = 0.0; // Frete grátis acima de R$ 300
        }
    }

    public double getTotalComFrete() {
        return total + frete;
    }

    public double getTotal() {
        return total;
    }

    public double getFrete() {
        return frete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public FormaDePagamento getPagamento() {
        return pagamento;
    }
}