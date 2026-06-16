package File_E_Buffered.Inventário_De_Laboratório_Tech.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import File_E_Buffered.Inventário_De_Laboratório_Tech.entities.Equipamento;
import File_E_Buffered.Inventário_De_Laboratório_Tech.entities.Computador;

public class Main {

    public static void main(String[] args) {
        String pastaUsuario = "C:\\Users\\Aluno_Tarde\\Desktop\\";

        String arquivoEntrada = pastaUsuario + "entrada_inventario.txt";
        String arquivoValidos = pastaUsuario + "relatorio_valido.txt";
        String arquivoErros = pastaUsuario + "log_erros.txt";

        List<Equipamento> inventario = new ArrayList<>();
        List<String> linhasComErro = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada))) {
            String linha;
            int numeroLinha = 0;

            while ((linha = br.readLine()) != null) {
                numeroLinha++;

                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(",");
                String tipo = dados[0];

                if (tipo.equals("E")) {
                    Equipamento eq = new Equipamento(dados[1], dados[2]);
                    inventario.add(eq);
                } else if (tipo.equals("C")) {
                    Computador comp = new Computador(dados[1], dados[2], dados[3], dados[4]);
                    inventario.add(comp);
                } else {
                    String mensagemErro = "Linha " + numeroLinha + " (Tipo '" + tipo + "' inválido): " + linha;
                    linhasComErro.add(mensagemErro);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        try (BufferedWriter bwValidos = new BufferedWriter(new FileWriter(arquivoValidos));
             BufferedWriter bwErros = new BufferedWriter(new FileWriter(arquivoErros))) {

            bwValidos.write(" RELATÓRIO DE INVENTÁRIO VÁLIDO ");
            bwValidos.newLine();
            for (Equipamento eq : inventario) {
                bwValidos.write(eq.toString());
                bwValidos.newLine();
            }
            bwValidos.flush();

            bwErros.write(" LOG DE ERROS DE PROCESSAMENTO");
            bwErros.newLine();
            for (String erro : linhasComErro) {
                bwErros.write(erro);
                bwErros.newLine();
            }
            bwErros.flush();

            System.out.println("Relatórios gerados com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao gravar os arquivos: " + e.getMessage());
        }
    }
}
