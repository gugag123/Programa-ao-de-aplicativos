package Java_2_File_E_Buffered.Gerenciador_De_Playlist_De_Musicas.entities;

public class Musicas {
    private String titulo;
    private String artista;
    private int anoLancamento;

    public Musicas(String titulo, String artista, int anoLancamento){
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    @Override
    public String toString() {
        return "Musicas{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}