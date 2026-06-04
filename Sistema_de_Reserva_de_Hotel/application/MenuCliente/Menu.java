package Sistema_de_Reserva_de_Hotel.application.MenuCliente;

import Sistema_de_Reserva_de_Hotel.entities.Classes.Quartos;
import Sistema_de_Reserva_de_Hotel.entities.Classes.Checkin;
import Sistema_de_Reserva_de_Hotel.entities.Enums.Pagamento;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menuUser() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Quartos> quartos = new ArrayList<>();
        ArrayList<Checkin> reservas = new ArrayList<>();

        quartos.add(new Quartos(101, 200));
        quartos.add(new Quartos(102, 300));
        quartos.add(new Quartos(103, 450));

        System.out.println("=== RESERVA DE HOTEL ===");

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Check-in (HH:MM): ");
        LocalTime dataCheckin = LocalTime.parse(sc.nextLine());

        System.out.print("Check-out (HH:MM): ");
        LocalTime dataCheckout = LocalTime.parse(sc.nextLine());

        System.out.print("Quantidade de hóspedes: ");
        int hospedes = sc.nextInt();

        if (hospedes <= 0) {
            System.out.println("Quantidade de hóspedes inválida.");
            return;
        }

        System.out.println("QUARTOS DISPONÍVEIS");

        for (int i = 0; i < quartos.size(); i++) {
            System.out.println(
                    (i + 1) + " - Quarto "
                            + quartos.get(i).getNumero()
                            + " | Diária: R$ "
                            + quartos.get(i).getValorDiaria()
            );
        }

        System.out.print("Escolha o quarto: ");
        int escolha = sc.nextInt();

        if (escolha < 1 || escolha > quartos.size()) {
            System.out.println("Quarto inválido.");
            return;
        }

        System.out.print("Quantidade de diárias: ");
        int diarias = sc.nextInt();

        Quartos quartoEscolhido = quartos.get(escolha - 1);

        double total = diarias * quartoEscolhido.getValorDiaria();

        double desconto = 0;

        if (diarias > 5) {
            desconto = total * 0.10;
        }

        double valorFinal = total - desconto;

        Checkin novoCheckin = new Checkin(
                hospedes,
                dataCheckin,
                dataCheckout,
                cidade,
                total,
                quartoEscolhido
        );

        reservas.add(novoCheckin);

        System.out.println("RESUMO DA RESERVA");
        System.out.println("Cidade: " + cidade);
        System.out.println("Check-in: " + dataCheckin);
        System.out.println("Check-out: " + dataCheckout);
        System.out.println("Quarto: " + quartoEscolhido.getNumero());
        System.out.println("Hóspedes: " + hospedes);
        System.out.println("Diárias: " + diarias);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        if (desconto > 0) {
            System.out.println("Desconto de 10% aplicado.");
        }

        sc.nextLine();

        System.out.print("Forma de pagamento (PIX/Dinheiro/Cartao): ");
        String formaPagamento = sc.nextLine();

        System.out.print("Pagamento aprovado? (sim/nao): ");
        String aprovado = sc.nextLine();

        if (aprovado.equalsIgnoreCase("nao")) {
            System.out.println("Pagamento recusado.");
        } else {
            System.out.println("RESERVA CONFIRMADA");
            System.out.println("Hospedagem registrada.");
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.println("Confirmação enviada por e-mail.");
            System.out.println("Reserva confirmada com sucesso!");
        }

        sc.close();
    }
}