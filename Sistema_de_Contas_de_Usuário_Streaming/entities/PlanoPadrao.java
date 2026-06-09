package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nome, String email) {
        super(nome, email);
        super.setPrecoBase(30.00);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Plano: Padrão" +
                " Qualidade Máxima: " + qualidadeVideo +
                " Limite de Telas: " + limiteTelas + " telas" +
                String.format(" Valor Mensal: R$ %.2f", getPrecoBase());
    }
}

