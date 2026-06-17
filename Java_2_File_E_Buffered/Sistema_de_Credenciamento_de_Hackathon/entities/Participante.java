package Java_2_File_E_Buffered.Sistema_de_Credenciamento_de_Hackathon.entities;

public class Participante {
    private String nome;
    private int idade;
    private String matricula;

    public Participante(String nome, int idade, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 14 && idade <= 21) {
            this.idade = idade;
        } else {
            this.idade = -1;
        }
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
