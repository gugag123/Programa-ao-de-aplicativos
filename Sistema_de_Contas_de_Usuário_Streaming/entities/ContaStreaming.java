package Sistema_de_Contas_de_Usuário_Streaming.entities;

public class ContaStreaming {
    private String nomeUsuario;
    private String email;
    private double precoBase;

    public ContaStreaming(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.precoBase = 0.0;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Usuário: " + nomeUsuario + "\nE-mail: " + email;
    }
}

