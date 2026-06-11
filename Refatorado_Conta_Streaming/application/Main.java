package Refatorado_Conta_Streaming.application;

import Refatorado_Conta_Streaming.entities.ContaStreaming;
import Refatorado_Conta_Streaming.entities.PlanoPadrao;
import Refatorado_Conta_Streaming.entities.PlanoPremium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu e-mail: ");
        String email = sc.nextLine();

        if (nome.trim().isEmpty() || email.trim().isEmpty()) {
            System.out.println("Erro: O nome e o e-mail não podem conter apenas espaços em branco ou estarem vazios.");
            sc.close();
            return;
        }

        System.out.println(" Escolha o tipo de plano:");
        System.out.println("1 - Plano Padrão (R$ 30,00)");
        System.out.println("2 - Plano Premium (R$ 50,00)");
        System.out.print("Sua opção: ");

        ContaStreaming contaUsuario = null;

        try {
            int opcao = sc.nextInt();

            if (opcao == 1) {
                contaUsuario = new PlanoPadrao(nome, email);
            } else if (opcao == 2) {
                contaUsuario = new PlanoPremium(nome, email);
            } else {
                System.out.println("Opção inválida! Encerrando sistema.");
                sc.close();
                return;
            }

            System.out.println("\n RECIBO DE ASSINATURA ");
            System.out.println(contaUsuario.toString());

        } catch (InputMismatchException e) {
            System.out.println(" [ERRO]: Entrada inválida! Você deve digitar um número inteiro (1 ou 2).");
        } finally {
            sc.close();
        }
    }
}
