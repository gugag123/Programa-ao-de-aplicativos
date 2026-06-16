package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public abstract class Aluno {

    private String nomeAluno;
    private int matricula;
    private boolean possuiMulta;
    private int livrosEmprestados;

    public Aluno(String nomeAluno, int matricula, boolean possuiMulta, int livrosEmprestados) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.possuiMulta = possuiMulta;
        this.livrosEmprestados = livrosEmprestados;
    }

    public abstract void exibirDados();

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isPossuiMulta() {
        return possuiMulta;
    }

    public void setPossuiMulta(boolean possuiMulta) {
        this.possuiMulta = possuiMulta;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}