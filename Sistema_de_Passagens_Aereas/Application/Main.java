package Sistema_de_Passagens_Aereas.Application;

import java.util.Scanner;
import Sistema_de_Passagens_Aereas.Entities.Passagem;
import Sistema_de_Passagens_Aereas.Entities.ClasseEconomica;
import Sistema_de_Passagens_Aereas.Entities.ClasseExecutiva;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do passageiro: ");
        String nome = sc.nextLine();

        System.out.print("Número do voo: ");
        String voo = sc.nextLine();

        System.out.print("Preço da passagem: ");
        double preco = sc.nextDouble();

        System.out.println("1 - Econômica");
        System.out.println("2 - Executiva");
        System.out.print("Escolha a classe: ");
        int opcao = sc.nextInt();

        Passagem passagem = null;

        if (opcao == 1) {
            System.out.print("Deseja despachar mala? (sim/não): ");
            String resposta = sc.next();
            boolean despacharMala = resposta.equalsIgnoreCase("sim");
            passagem = new ClasseEconomica(nome, voo, preco, despacharMala);
        } else if (opcao == 2) {
            passagem = new ClasseExecutiva(nome, voo, preco);
        } else {
            System.out.println("Opção inválida!");
            sc.close();
            return;
        }

        System.out.println(" " + passagem);

        sc.close();
    }
}