package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class PlanoPremium extends ContaStreaming {
    private String qualidadeVideo = "4K Ultra HD";
    private int limiteTelas = 4;
    private boolean permiteDownload = true;

    public PlanoPremium(String nome, String email) {
        super(nome, email, TipoPlano.PREMIUM);
    }

    @Override
    public String toString() {
        String statusDownload = permiteDownload ? "Ativo (Permite assistir offline)" : "Inativo";

        return super.toString() +
                "\nPlano: " + getTipoPlano() +
                "\nQualidade Máxima: " + qualidadeVideo +
                "\nLimite de Telas: " + limiteTelas + " telas" +
                "\nDownload Offline: " + statusDownload +
                String.format("\nValor Mensal: R$ %.2f", getPreco());
    }
}
