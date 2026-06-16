package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public abstract class Pessoa {

    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void exibirDados();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}