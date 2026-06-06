package Sistema_de_Controle_de_BibliotecaEscolar_Refatorado_Enum.entities;

public class emprestimo {
    public class aluno {

        private String nomeAluno;
        private int matricula;
        private boolean possuiMulta;
        private int livrosEmprestados;

        private String tituloLivro;
        private int codigoLivro;
        private boolean livroDisponivel;

        public aluno(String nomeAluno, int matricula,
                     boolean possuiMulta, int livrosEmprestados,
                     String tituloLivro, int codigoLivro,
                     boolean livroDisponivel) {

            this.nomeAluno = nomeAluno;
            this.matricula = matricula;
            this.possuiMulta = possuiMulta;
            this.livrosEmprestados = livrosEmprestados;

            this.tituloLivro = tituloLivro;
            this.codigoLivro = codigoLivro;
            this.livroDisponivel = livroDisponivel;
        }

        public ResultadoEmprestimo realizarEmprestimo(int matriculaDigitada, int codigoDigitado) {

            if (matriculaDigitada != matricula) {
                return ResultadoEmprestimo.ALUNO_NAO_ENCONTRADO;
            }

            if (possuiMulta) {
                return ResultadoEmprestimo.MULTA_PENDENTE;
            }

            if (livrosEmprestados >= 3) {
                return ResultadoEmprestimo.LIMITE_ATINGIDO;
            }

            if (codigoDigitado != codigoLivro || !livroDisponivel) {
                return ResultadoEmprestimo.LIVRO_INDISPONIVEL;
            }

            livrosEmprestados++;
            livroDisponivel = false;

            return ResultadoEmprestimo.SUCESSO;
        }


    }

}

