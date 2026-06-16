package File_E_Buffered.Inventário_De_Laboratório_Tech.entities;

public class Equipamento {
    private String id;
    private String marca;
    ;

    public Equipamento(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Equipamento[ID: " + id + ",Marca: " + marca + "]";
    }
}
