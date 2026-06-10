package Sistema_de_Passagens_Aereas.Entities;

public class Passagem {

    private String numeroVoo;
    private String nomePassageiro;
    private double precoOriginal;
    private TipoClasse tipoClasse;

    public Passagem(String nomePassageiro, String numeroVoo, double precoOriginal, TipoClasse tipoClasse) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
        this.precoOriginal = precoOriginal;
        this.tipoClasse = tipoClasse;
    }

    public String getNomePassageiro() { return nomePassageiro; }
    public void setNomePassageiro(String nomePassageiro) { this.nomePassageiro = nomePassageiro; }

    public String getNumeroVoo() { return numeroVoo; }
    public void setNumeroVoo(String numeroVoo) { this.numeroVoo = numeroVoo; }

    public double getPrecoOriginal() { return precoOriginal; }
    public void setPrecoOriginal(double precoOriginal) { this.precoOriginal = precoOriginal; }

    public TipoClasse getTipoClasse() { return tipoClasse; }
    public void setTipoClasse(TipoClasse tipoClasse) { this.tipoClasse = tipoClasse; }

    public double calcularPrecoFinal() {
        return precoOriginal;
    }
}