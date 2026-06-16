package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities;

public final class Paciente extends Consulta {
    public String cpf;
    public String nomePaciente;

    public Paciente(String nomePaciente, String cpf,Especialidade especialidade ) {
        super( null,null);
        this.nomePaciente=nomePaciente;
        this.cpf=cpf;
    }

    public Paciente(Especialidade especialidade, String horarioEscolhido) {
        super(especialidade, horarioEscolhido);
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }
}
