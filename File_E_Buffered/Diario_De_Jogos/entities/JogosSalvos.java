package File_E_Buffered.Diario_De_Jogos.entities;

public class JogosSalvos {
    private String jogos;

    public JogosSalvos(String jogos) {
        this.jogos = jogos;
    }

    public String jogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    @Override
    public String toString() {
        return jogos;
    }
}