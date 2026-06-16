package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.aplication;

import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities.Consulta;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities.Especialidade;
import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities.Paciente;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities.Especialidade.*;

public class acao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ARRAY DE PACIENTES
        Paciente[] pacientes = new Paciente[3];

        pacientes[0] = new Paciente(
                "Gustavo",
                "12345678901", CARDIOLOGIA
        );

        pacientes[1] = new Paciente(
                "Bárbara",
                "24680156081", DERMATOLOGIA
        );

        pacientes[2] = new Paciente(
                "Arthur",
                "01364835030", PEDIATRA
        );


        String[] horarios = {
                "08:00",
                "09:00",
                "10:00"
        };

        System.out.println(" SISTEMA DE AGENDAMENTO MÉDICO ");


        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();


        if (cpf.length() != 11
                || !cpf.matches("\\d+")) {

            System.out.println("Paciente não cadastrado.");
            return;
        }


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();


        System.out.print("Digite sua especialidade: ");
        for (int i = 0; i < Especialidade.values().length; i++) {
            System.out.println((i + 1) + " - " + Especialidade.values()[i]);
        }
        int opcaoEsp = sc.nextInt();
        sc.nextLine();
        if (opcaoEsp < 1 || opcaoEsp > Especialidade.values().length) {
            System.out.println("especialidade invalida");
            return;
        }
        Especialidade especialidade =
                Especialidade.values()[opcaoEsp - 1];


        boolean pacienteExiste = false;

        for (int i = 0; i < pacientes.length; i++) {

            if (pacientes[i] != null
                    && pacientes[i].getCpf().trim().equals(cpf)
                    && pacientes[i].getNomePaciente().trim().equalsIgnoreCase(nome)) {

                pacienteExiste = true;
                break;
            }
        }


        if (!pacienteExiste) {

            System.out.println("Paciente não cadastrado.");
            return;
        }


        if (horarios.length == 0) {

            System.out.println("Não há horários disponíveis.");
            return;
        }


        System.out.println("Horários disponíveis:");

        for (int i = 0; i < horarios.length; i++) {

            System.out.println(
                    (i + 1) + " - " + horarios[i]
            );
        }


        System.out.print("Escolha um horário: ");
        int escolha = sc.nextInt();


        if (escolha < 1
                || escolha > horarios.length) {

            System.out.println("Horário indisponível.");
            return;
        }


        String horarioEscolhido =
                horarios[escolha - 1];


        Consulta consulta = new Paciente(especialidade,
                horarioEscolhido);


        System.out.println(
                "Consulta agendada com sucesso."
        );

        System.out.println(
                "Especialidade: "
                        + consulta.getEspecialidade()
        );

        System.out.println(
                "Horário: "
                        + consulta.getHorarioHescolhido()
        );
        while (true) {
            try {
                opcaoEsp = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números.");
                sc.nextLine();
            } catch (Exception a ) {
                System.out.println("Erro: digite apenas números.");
                return;
            }

            if (opcaoEsp < 1 || opcaoEsp > Especialidade.values().length) {
                System.out.println("Especialidade inválida.");
                return;
            }
            sc.close();
        }
    }
}

