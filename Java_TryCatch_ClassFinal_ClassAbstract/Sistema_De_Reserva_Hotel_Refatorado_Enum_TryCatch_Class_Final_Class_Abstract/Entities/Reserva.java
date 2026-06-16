package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;

public class Reserva {

    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public Reserva(Hospede hospede, Quarto quarto, int diarias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public final double calcularValorTotal() {
        double total = quarto.getValorDiaria() * diarias;

        if (diarias > 5) {
            total *= 0.90; // Desconto de 10% (0.90 mantém 90% do valor)
        }

        return total;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDiarias() {
        return diarias;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "\nHospede = " + hospede.getNome() +
                "\nQuarto   = " + quarto.getNumero() +
                "\nDiárias  = " + diarias +
                "\nValor Total = R$ " + String.format("%.2f", calcularValorTotal()) +
                "\n}";
    }
}
