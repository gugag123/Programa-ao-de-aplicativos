package Java_TryCatch_ClassFinal_ClassAbstract.Controle_de_Estacionamento.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    private final int Total_Vagas = 5;

    public void entradaVeiculo(Scanner sc) {

        try {

            if (veiculos.size() >= Total_Vagas) {

                System.out.println("Estacionamento lotado. ");
                return;
            }

            System.out.print("Digite a placa: ");
            String placa = sc.nextLine();

            System.out.print("Digite o tipo do veículo (carro/moto): ");
            String tipo = sc.nextLine();

            System.out.print("Digite a hora de entrada: ");
            int horaEntrada = sc.nextInt();
            sc.nextLine();

            Veiculo veiculo;

            if (tipo.equalsIgnoreCase("carro")) {

                veiculo = new Carro(placa, horaEntrada);

            } else {

                veiculo = new Moto(placa, horaEntrada);
            }

            veiculos.add(veiculo);

            System.out.println("Veículo estacionado com sucesso. ");

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar veículo. ");
            sc.nextLine();
        }
    }

    public void saidaVeiculo(Scanner sc) {

        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo v = veiculos.get(i);

            if (v.getPlaca().equalsIgnoreCase(placa)) {

                encontrado = true;

                try {

                    System.out.print("Digite a hora de saída: ");
                    int horaSaida = sc.nextInt();
                    sc.nextLine();

                    int tempo = horaSaida - v.getHoraEntreda();

                    double valor = v.calcularValor(tempo);

                    System.out.println("Tempo estacionado: " + tempo + " hora(s)");
                    System.out.println("Valor total: R$ " + valor);

                    System.out.print("Pagamento aprovado? (s/n): ");
                    String pagamento = sc.nextLine();

                    if (pagamento.equalsIgnoreCase("s")) {

                        veiculos.remove(i);

                        System.out.println("Saída liberada. ");

                    } else {

                        System.out.println("Pagamento não autorizado. ");
                    }

                } catch (Exception e) {

                    System.out.println("Erro ao processar saída. ");
                    sc.nextLine();
                }

                break;
            }
        }

        if (!encontrado) {

            System.out.println("Veículo não encontrado. ");
        }
    }

    public void listarVeiculos() {

        System.out.println(" VEÍCULOS ESTACIONADOS ");

        if (veiculos.isEmpty()) {

            System.out.println("Nenhum veículo estacionado. ");
            return;
        }

        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo v = veiculos.get(i);

            System.out.println(
                    (i + 1)
                            + " | Placa: " + v.getPlaca()
                            + " | Tipo: " + v.getTipo()
                            + " | Hora Entrada: " + v.getHoraEntreda()
            );
        }
    }
}