package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class PlanoPremium extends ContaStreaming {
    private String qualidadeVideo = "4K Ultra HD";
    private int limiteTelas = 4;
    private boolean permiteDownload = true;

    public PlanoPremium(String nome, String email) {
        super(nome, email);
        super.setPrecoBase(50.00);
    }

    @Override
    public String toString() {
        String statusDownload = permiteDownload ? "Ativo (Permite assistir offline)" : "Inativo";

        return super.toString() +
                " Plano: Premium " +
                " Qualidade Máxima: " + qualidadeVideo +
                " Limite de Telas: " + limiteTelas + " telas" +
                " Download Offline: " + statusDownload +
                String.format(" Valor Mensal: R$ %.2f", getPrecoBase());
    }
}
