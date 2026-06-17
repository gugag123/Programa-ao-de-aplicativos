package Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.application;


import Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities.Atirador;
import Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities.LutadorCorpoACorpo;
import Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities.Personagem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String caminhoPersonagens = "C:\\Users\\Aluno_Tarde\\Desktop\\personagens_db.csv.txt";

        ArrayList<Personagem> personagens = new ArrayList<>();

        try {BufferedReader br = new BufferedReader(new FileReader(caminhoPersonagens));

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                String tipo = dados[0];
                String nome = dados[1];
                int forcaBase = Integer.parseInt(dados[2]);
                String atributo = dados[3];

                if (tipo.equals("L")) {

                    LutadorCorpoACorpo lutador =
                            new LutadorCorpoACorpo(nome, forcaBase, atributo);

                    personagens.add(lutador);

                } else if (tipo.equals("A")) {

                    Atirador atirador =
                            new Atirador(nome, forcaBase, atributo);

                    personagens.add(atirador);
                }
            }

            br.close();

            System.out.println(" ELENCO DO JOGO DE LUTA ");

            for (Personagem personagem : personagens) {
                System.out.println(personagem);
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}