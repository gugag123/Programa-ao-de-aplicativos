package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Controle_De_Biblioteca_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Livro {
    private String tituloLivro;
    private int codigoLivro;
    private boolean livroDisponivel;

    public Livro(String tituloLivro, int codigoLivro, boolean livroDisponivel){
        this.tituloLivro = tituloLivro;
        this.codigoLivro = codigoLivro;
        this.livroDisponivel = livroDisponivel;
    }
    public String getTituloLivro(){
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public int getCodigoLivro() {
        return codigoLivro;
    }
    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
    public boolean isLivroDisponivel() {
        return livroDisponivel;
    }
    public void setLivroDisponivel(boolean livroDisponivel) {
        this.livroDisponivel = livroDisponivel;
    }
}