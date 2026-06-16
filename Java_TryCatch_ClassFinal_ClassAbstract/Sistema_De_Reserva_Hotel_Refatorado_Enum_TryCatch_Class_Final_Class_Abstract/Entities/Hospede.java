package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;

public final class Hospede {

    private String nome;

    public Hospede(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "Nome = '" + nome + '\'' +
                '}';
    }
}