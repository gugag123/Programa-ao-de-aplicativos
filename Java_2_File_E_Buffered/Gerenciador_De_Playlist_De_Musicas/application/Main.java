package Java_2_File_E_Buffered.Gerenciador_De_Playlist_De_Musicas.application;

import Java_2_File_E_Buffered.Gerenciador_De_Playlist_De_Musicas.entities.Musicas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musicas> lista = List.of(
                new Musicas("Erro Favorito", "2ZDinizz", 2026),
                new Musicas("Cheia de Manias", "Raça Negra", 1992),
                new Musicas("Pisando Descalço", "Maneva", 2009),
                new Musicas("Beliver", "Imagine Dragons", 2017)
        );
        String arquivo = "C:\\Users\\Aluno_Tarde\\Desktop\\minha_playlist.txt";
        File es = new File(arquivo);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Musicas m : lista) {
                bw.write(m.toString());
                bw.newLine(); // pula para a próxima linha
            }
            System.out.println("Arquivo minha_playlist.txt criado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
        List<Musicas> musicasLidas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(es))) {
            String linha;
            while ((linha = br.readLine())!=null){
                System.out.println(linha);
            }
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}