package Sistema_de_Controle_de_Estacionamento_Refatorado_Enum.entities;

public class Veiculo {

    private String placa;
    private TipoVeiculo tipo;
    private int horaEntrada;

    public Veiculo(String placa,
                   TipoVeiculo tipo,
                   int horaEntrada) {

        this.placa = placa;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}

