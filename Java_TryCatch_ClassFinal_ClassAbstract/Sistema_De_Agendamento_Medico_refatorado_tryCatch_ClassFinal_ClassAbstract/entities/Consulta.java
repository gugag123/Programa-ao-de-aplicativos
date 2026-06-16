package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Agendamento_Medico_refatorado_tryCatch_ClassFinal_ClassAbstract.entities;

public abstract class Consulta {
    private Especialidade especialidade;
    private String horario;
    private String horarioHescolhido;

    public Consulta(Especialidade especialidade, String horarioEscolhido) {
        this.especialidade=especialidade;
        this.horarioHescolhido=horarioEscolhido;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String getHorario() {
        return horario;
    }
    public String getHorarioHescolhido(){
        return horarioHescolhido;
    }
}



