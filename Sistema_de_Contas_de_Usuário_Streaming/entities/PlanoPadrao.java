package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nome, String email) {
        super(nome, email, TipoPlano.PADRAO);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlano: " + getTipoPlano() +
                "\nQualidade Máxima: " + qualidadeVideo +
                "\nLimite de Telas: " + limiteTelas + " telas" +
                String.format("\nValor Mensal: R$ %.2f", getPreco());
    }
}

