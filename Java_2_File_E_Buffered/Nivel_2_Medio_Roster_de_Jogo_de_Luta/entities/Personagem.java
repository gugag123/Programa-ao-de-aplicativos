package Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities;

public class Personagem {

    private String nome;
    private int forcaBase;

    public Personagem(String nome, int forcaBase) {
        this.nome = nome;
        this.forcaBase = forcaBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(int forcaBase) {
        this.forcaBase = forcaBase;
    }

    @Override
    public String toString() {

        return "Personagem[nome: " + nome + " ,forcaBase: " + forcaBase + " ] ";
    }
}
