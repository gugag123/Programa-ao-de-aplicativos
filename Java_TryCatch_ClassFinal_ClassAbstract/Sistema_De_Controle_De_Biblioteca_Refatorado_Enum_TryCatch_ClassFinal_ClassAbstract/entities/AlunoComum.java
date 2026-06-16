package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public class AlunoComum extends Aluno {
    public AlunoComum(String nomeAluno, int matricula, boolean possuiMulta, int livrosEmprestados) {
        super(nomeAluno, matricula, possuiMulta, livrosEmprestados);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNomeAluno());
        System.out.println("Matrícula: " + getMatricula());
    }
}