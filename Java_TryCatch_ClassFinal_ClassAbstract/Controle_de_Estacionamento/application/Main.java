package Java_TryCatch_ClassFinal_ClassAbstract.Controle_de_Estacionamento.application;

import Java_TryCatch_ClassFinal_ClassAbstract.Controle_de_Estacionamento.entities.Estacionamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento();

        int opcao;

        do {

            System.out.println(" ESTACIONAMENTO ");
            System.out.println("1 - Entrada de veículo");
            System.out.println("2 - Saída de veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            try {

                opcao = sc.nextInt();
                sc.nextLine();

            } catch (Exception e) {

                System.out.println("Digite apenas números. ");

                sc.nextLine();
                opcao = -1;
            }

            switch (opcao) {

                case 1:
                    estacionamento.entradaVeiculo(sc);
                    break;

                case 2:
                    estacionamento.saidaVeiculo(sc);
                    break;

                case 3:
                    estacionamento.listarVeiculos();
                    break;

                case 0:
                    System.out.println("Sistema encerrado. ");
                    break;

                default:
                    System.out.println("Opção inválida. ");
            }

        } while (opcao != 0);

        sc.close();
    }
}