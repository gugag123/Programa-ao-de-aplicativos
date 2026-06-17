package Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities;

public class LutadorCorpoACorpo extends Personagem {

    private String arteMarcial;

    public LutadorCorpoACorpo(String nome, int forcaBase, String arteMarcial) {
        super(nome, forcaBase);
        this.arteMarcial = arteMarcial;
    }

    public String getArteMarcial() {
        return arteMarcial;
    }

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    public String toString() {
        return "[Lutador] " + super.toString() + ",arteMarcial" + arteMarcial;
    }
}


