package Java_TryCatch_ClassFinal_ClassAbstract.Controle_de_Estacionamento.entities;

public abstract class Veiculo {
    private String placa;
    private int horaEntreda;
    private TipoVeiculo tipo;

    public Veiculo(String placa, int horaEntreda, TipoVeiculo tipo) {
        this.placa = placa;
        this.horaEntreda = horaEntreda;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHoraEntreda() {
        return horaEntreda;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public abstract double calcularValor(int horas);
}

