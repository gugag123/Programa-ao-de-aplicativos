package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public class Emprestimo {

    public ResultadoEmprestimo realizarEmprestimo(Aluno aluno, Livro livro) {

        if (aluno == null) {
            return ResultadoEmprestimo.ALUNO_NAO_ENCONTRADO;
        }

        if (aluno.isPossuiMulta()) {
            return ResultadoEmprestimo.MULTA_PENDENTE;
        }

        if (aluno.getLivrosEmprestados() >= 3) {
            return ResultadoEmprestimo.LIMITE_ATINGIDO;
        }

        if (!livro.isLivroDisponivel()) {
            return ResultadoEmprestimo.LIVRO_INDISPONIVEL;
        }

        aluno.setLivrosEmprestados(
                aluno.getLivrosEmprestados() + 1);

        livro.setLivroDisponivel(false);

        return ResultadoEmprestimo.SUCESSO;
    }
}