package Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.application;

import Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.entities.Desenvolvedor;
import Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.entities.Designer;
import Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.entities.Participante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String pastaUsuario = "C:\\Users\\Aluno_Tarde\\Desktop\\";

        String arquivoEntrada = pastaUsuario + "inscricoes_brutas.txt";
        String arquivoAprovados = pastaUsuario + "aprovados_hackathon.txt";
        String arquivoPendencias = pastaUsuario + "pendencias_inscricao.txt";

        List<Participante> aprovados = new ArrayList<>();
        List<String> pendencias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada))) {
            String linha;
            int numeroLinha = 0;

            while ((linha = br.readLine()) != null) {
                numeroLinha++;

                if (linha.trim().isEmpty()) {
                    continue;
                }

                try {
                    String[] dados = linha.split(",");
                    String tipo = dados[0];
                    String nome = dados[1];
                    int idade = Integer.parseInt(dados[2]);
                    String matricula = dados[3];
                    String especialidade = dados[4];

                    if (tipo.equals("DEV")) {
                        Desenvolvedor dev = new Desenvolvedor(nome, idade, matricula, especialidade);
                        if (dev.getIdade() == -1) {
                            pendencias.add("Linha " + numeroLinha + " (Idade inválida para o Hackathon): " + linha);
                        } else {
                            aprovados.add(dev);
                        }
                    } else if (tipo.equals("DESIGN")) {
                        Designer des = new Designer(nome, idade, matricula, especialidade);
                        if (des.getIdade() == -1) {
                            pendencias.add("Linha " + numeroLinha + " (Idade inválida para o Hackathon): " + linha);
                        } else {
                            aprovados.add(des);
                        }
                    } else {
                        pendencias.add("Linha " + numeroLinha + " (Tipo de inscrição desconhecido): " + linha);
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    pendencias.add("Linha " + numeroLinha + " (Faltando colunas de dados): " + linha);
                } catch (NumberFormatException e) {
                    pendencias.add("Linha " + numeroLinha + " (Idade com formato de texto incorreto): " + linha);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        try (BufferedWriter bwAprovados = new BufferedWriter(new FileWriter(arquivoAprovados));
             BufferedWriter bwPendencias = new BufferedWriter(new FileWriter(arquivoPendencias))) {

            bwAprovados.write(" PARTICIPANTES APROVADOS NO HACKATHON ");
            bwAprovados.newLine();
            for (Participante p : aprovados) {
                bwAprovados.write(p.toString());
                bwAprovados.newLine();
            }
            bwAprovados.flush();

            bwPendencias.write(" LOG DE INSCRIÇÕES COM PENDÊNCIAS ");
            bwPendencias.newLine();
            for (String erro : pendencias) {
                bwPendencias.write(erro);
                bwPendencias.newLine();
            }
            bwPendencias.flush();


            System.out.println("Processamento do Hackathon concluído com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao gravar os arquivos: " + e.getMessage());
        }
    }
}

