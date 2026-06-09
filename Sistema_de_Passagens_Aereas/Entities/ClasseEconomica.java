package Sistema_de_Passagens_Aereas.Entities;

public class ClasseEconomica extends Passagem {

    private boolean despacharMala;
    private double taxaBagagem = 120.0;

    public ClasseEconomica(String nomePassageiro,
                           String numeroVoo,
                           double precoOriginal,
                           boolean despacharMala) {

        super(nomePassageiro, numeroVoo, precoOriginal);
        this.despacharMala = despacharMala;
    }

    public boolean isDespacharMala() {
        return despacharMala;
    }

    public void setDespacharMala(boolean despacharMala) {
        this.despacharMala = despacharMala;
    }

    @Override
    public double calcularPrecoFinal() {

        if (despacharMala) {
            return getPrecoOriginal() + taxaBagagem;
        }

        return getPrecoOriginal();
    }

    @Override
    public String toString() {
        return " PASSAGEM ECONÔMICA "
                + "Passageiro: " + getNomePassageiro() + " "
                + "Número do voo: " + getNumeroVoo() + " "
                + "Tipo: Econômica "
                + "Mala Despachada: " + (despacharMala ? "Sim" : "Não") + " "
                + "Preço Final: R$ " + calcularPrecoFinal();
    }
}