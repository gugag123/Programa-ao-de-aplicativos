package Java_TryCatch_ClassFinal_ClassAbstract.Controle_de_Estacionamento.entities;

public class Carro extends Veiculo {

    public Carro(String placa, int horaEntrada) {
        super(placa, horaEntrada, TipoVeiculo.CARRO);
    }

    @Override
    public double calcularValor(int horas) {
        return TarifaEstacionamento.calcularTarifa(horas);
    }
}