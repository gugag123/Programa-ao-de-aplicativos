package File_E_Buffered.Inventário_De_Laboratório_Tech.entities;

public class Computador extends Equipamento{
    private String procesador;
    private String quantidadeMemoria;

    public Computador (String id, String marca, String procesador, String quantidadeMemoria){
        super(id, marca);
        this.procesador = procesador;
        this.quantidadeMemoria = quantidadeMemoria;
    }
    public String getProcesador(){return procesador;}
    public String getQuantidadeMemoria(){return quantidadeMemoria;}

    @Override
    public String toString(){
        return "Computador [ID: " +getId() + ", MArca: " + getMarca()+
                ", Processador: " +procesador + ", RAM: " + quantidadeMemoria +"]";
    }
}
