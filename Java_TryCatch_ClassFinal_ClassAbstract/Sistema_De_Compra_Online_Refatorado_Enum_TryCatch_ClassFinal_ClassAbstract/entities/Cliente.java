package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome:     " + getNome());
        System.out.println("CPF:      " + getCpf());
        System.out.println("Endereço: " + endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}