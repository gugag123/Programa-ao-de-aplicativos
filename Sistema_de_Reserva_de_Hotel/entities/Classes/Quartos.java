package Sistema_de_Reserva_de_Hotel.entities.Classes;

public class Quartos {
    private int numero;
    private double valorDiaria;

    public Quartos(int numero, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
    }
    public int getNumero(){
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}