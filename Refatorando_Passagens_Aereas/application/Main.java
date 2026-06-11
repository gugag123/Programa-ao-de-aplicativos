package Refatorando_Passagens_Aereas.application;

import Sistema_de_Passagens_Aereas.Entities.Passagem;
import Sistema_de_Passagens_Aereas.Entities.ClasseEconomica;
import Sistema_de_Passagens_Aereas.Entities.ClasseExecutiva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nome do passageiro: ");
            String nome = sc.nextLine();

            System.out.print("Número do voo: ");
            String voo = sc.nextLine();

            if (nome.trim().isEmpty() || voo.trim().isEmpty()) {
                System.out.println("\n[ERRO]: Nome do passageiro e número do voo não podem ser vazios.");
                sc.close();
                return;
            }

            System.out.print("Preço da passagem: ");
            double preco = sc.nextDouble();

            System.out.println("\n1 - Econômica");
            System.out.println("2 - Executiva");
            System.out.print("Escolha la classe: ");
            int opcao = sc.nextInt();

            Passagem passagem = null;

            if (opcao == 1) {
                System.out.print("Deseja despachar mala? (sim/não): ");
                String resposta = sc.next();
                boolean despacharMala = resposta.equalsIgnoreCase("sim");

                passagem = new ClasseEconomica(nome, voo, preco, despacharMala);
                System.out.println(passagem);

            } else if (opcao == 2) {
                passagem = new ClasseExecutiva(nome, voo, preco);
                System.out.println(passagem);

            } else {
                System.out.println("\nOpção de classe inválida!");
            }

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO]: Entrada de dados inválida! Verifique se digitou os valores numéricos corretamente.");
        } finally {
            sc.close();
        }
    }

}
