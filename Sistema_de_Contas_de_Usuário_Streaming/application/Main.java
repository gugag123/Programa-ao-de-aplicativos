package Sistema_de_Contas_de_Usuário_Streaming.application;
import Sistema_de_Contas_de_Usuário_Streaming.entities.ContaStreaming;
import Sistema_de_Contas_de_Usuário_Streaming.entities.PlanoPadrao;
import Sistema_de_Contas_de_Usuário_Streaming.entities.PlanoPremium;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" REFORMULAÇÃO DO SISTEMA DE STREAMING ");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("\nEscolha o tipo de plano:");
        System.out.println("1 - Plano Padrão (R$ 30,00)");
        System.out.println("2 - Plano Premium (R$ 50,00)");
        System.out.print("Sua opção: ");
        int opcao = scanner.nextInt();

        ContaStreaming contaUsuario = null;

        if (opcao == 1) {
            contaUsuario = new PlanoPadrao(nome, email);
        } else if (opcao == 2) {
            contaUsuario = new PlanoPremium(nome, email);
        } else {
            System.out.println("Opção inválida! Encerrando sistema.");
            scanner.close();
            return;
        }





















































        
        System.out.println("       RECIBO DE ASSINATURA      ");

        System.out.println(contaUsuario.toString());


        scanner.close();
    }
    }

