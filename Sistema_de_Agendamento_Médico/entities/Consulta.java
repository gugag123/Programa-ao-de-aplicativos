package Sistema_de_Agendamento_Médico.entities;

public class Consulta {
    public String especialidade;
    public String horario;

    public Consulta(String especialidade, String  horario){
        this.especialidade = especialidade;
        this.horario = horario;
    }
}
