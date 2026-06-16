package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Aplication;


import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Hospede;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Pagamento;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Quarto;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Reserva;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.enums.formaPagamento;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.enums.tipoQuarto;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println(" SISTEMA DE RESERVA DE HOTEL ");

            System.out.print("Nome do hospede: ");
            String nome = sc.nextLine();

            System.out.print("Cidade: ");
            String cidade = sc.nextLine();

            System.out.print("Quantidade de hospedes: ");
            int quantidadeHospedes = sc.nextInt();

            System.out.print("Quantidade de diárias: ");
            int diarias = sc.nextInt();

            System.out.println("\nTipos de quarto:");
            System.out.println("1 - SOLTEIRO");
            System.out.println("2 - CASAL");
            System.out.println("3 - LUXO");

            System.out.print("Escolha: ");
            int opcaoQuarto = sc.nextInt();

            tipoQuarto tipo;

            switch (opcaoQuarto) {
                case 1:
                    tipo = tipoQuarto.SOLTEIRO;
                    break;
                case 2:
                    tipo = tipoQuarto.CASAL;
                    break;
                case 3:
                    tipo = tipoQuarto.LUXO;
                    break;
                default:
                    tipo = tipoQuarto.CASAL;
            }

            sc.nextLine();

            Quarto quarto = new Quarto(101, tipo, 250.0);

            if (!quarto.isDisponivel()) {
                System.out.println("Nenhum quarto disponível.");
                return;
            }

            System.out.println("\nQuarto encontrado:");
            System.out.println(quarto);

            System.out.println("\nFormas de pagamento:");
            System.out.println("1 - PIX");
            System.out.println("2 - CARTAO");
            System.out.println("3 - DINHEIRO");

            System.out.print("Escolha: ");
            int opcaoPagamento = sc.nextInt();

            formaPagamento forma = null;

            switch (opcaoPagamento) {
                case 1:
                    forma = formaPagamento.PIX;
                    break;
                case 2:
                    forma = formaPagamento.CARTAO;
                    break;
                case 3:
                    forma = formaPagamento.DINHEIRO;
                    break;
                default:
                    forma = formaPagamento.PIX;
            }

            Hospede hospede = new Hospede(nome);

            Reserva reserva = new Reserva(hospede, quarto, diarias);

            Pagamento pagamento = new Pagamento(forma);

            System.out.println("\n RESUMO DA RESERVA ");
            System.out.println(reserva);

            if (pagamento.validarPagamento()) {

                quarto.reservar();

                System.out.println("\n PAGAMENTO ");
                System.out.println(pagamento);

                System.out.println("\nHospedagem registrada.");
                System.out.println("Confirmação enviada por e-mail.");
                System.out.println("Reserva confirmada.");

            } else {

                System.out.println("Pagamento recusado.");

            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar apenas números nas opções e quantidades.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
