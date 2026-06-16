package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;


import Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.enums.formaPagamento;

public final class Pagamento {

    private formaPagamento formaPagamento;
    private boolean aprovado;

    public Pagamento(formaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
        this.aprovado = false;
    }

    public boolean validarPagamento() {
        this.aprovado = true;
        return aprovado;
    }

    public formaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "\nForma de Pagamento = " + formaPagamento +
                "\nStatus             = " + (aprovado ? "Aprovado" : "Recusado") +
                "\n}";
    }
}