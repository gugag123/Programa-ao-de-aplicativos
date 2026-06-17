package Java_2_File_E_Buffered.Nivel_2_Medio_Roster_de_Jogo_de_Luta.entities;

public class Atirador extends Personagem {

    private String armaPrincipal;

    public Atirador(String nome, int forcaBase, String armaPrincipal) {
        super(nome, forcaBase);

        this.armaPrincipal = armaPrincipal;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String toString() {
        return "[Atirador] " + super.toString() + " ,armaPrincipal" + armaPrincipal;
    }
}
