package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;


import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.enums.tipoQuarto;

public final class Quarto {

    private int numero;
    private tipoQuarto tipo;
    private double valorDiaria;
    private boolean disponivel;

    public Quarto(int numero, tipoQuarto tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public tipoQuarto getTipo() {
        return tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "\nNúmero = " + numero +
                "\nTipo = " + tipo +
                "\nValor da Diária = R$ " + String.format("%.2f", valorDiaria) +
                "\nDisponível = " + (disponivel ? "Sim" : "Não") +
                "\n}";
    }
}

