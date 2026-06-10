package Sistema_de_Contas_de_Usuário_Streaming.application;

import Sistema_de_Contas_de_Usuário_Streaming.entities.ContaStreaming;
import Sistema_de_Contas_de_Usuário_Streaming.entities.PlanoPadrao;
import Sistema_de_Contas_de_Usuário_Streaming.entities.PlanoPremium;
import Sistema_de_Contas_de_Usuário_Streaming.entities.TipoPlano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu e-mail: ");
        String email = sc.nextLine();

        System.out.println("\nEscolha o tipo de plano:");
        System.out.printf("1 - Plano Padrão (R$ %.2f)%n", TipoPlano.PADRAO.getPreco());
        System.out.printf("2 - Plano Premium (R$ %.2f)%n", TipoPlano.PREMIUM.getPreco());
        System.out.print("Sua opção: ");
        int opcao = sc.nextInt();

        ContaStreaming contaUsuario = null;

        if (opcao == 1) {
            contaUsuario = new PlanoPadrao(nome, email);
        } else if (opcao == 2) {
            contaUsuario = new PlanoPremium(nome, email);
        } else {
            System.out.println("Opção inválida! Encerrando sistema.");
            sc.close();
            return;
        }

        System.out.println(" RECIBO DE ASSINATURA ");
        System.out.println(contaUsuario);


        sc.close();
    }
}

