package Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.entities;

public class Desenvolvedor extends Participante {
    private String linguagemFavorita;

    public Desenvolvedor(String nome, int idade, String matricula, String linguagemFavorita) {
        super(nome, idade, matricula);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    @Override
    public String toString() {
        return "DEV " + super.toString() + ", Linguagem: " + linguagemFavorita;
    }
}
