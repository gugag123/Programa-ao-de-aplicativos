package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class ContaStreaming {
    private String nomeUsuario;
    private String email;
    private TipoPlano tipoPlano;

    public ContaStreaming(String nomeUsuario, String email, TipoPlano tipoPlano) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipoPlano = tipoPlano;
    }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public TipoPlano getTipoPlano() { return tipoPlano; }
    public void setTipoPlano(TipoPlano tipoPlano) { this.tipoPlano = tipoPlano; }

    public double getPreco() {
        return tipoPlano.getPreco();
    }

    @Override
    public String toString() {
        return "Usuário: " + nomeUsuario + "\nE-mail: " + email;
    }
}

