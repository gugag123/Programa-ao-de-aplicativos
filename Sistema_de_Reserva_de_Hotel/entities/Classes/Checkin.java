package Sistema_de_Reserva_de_Hotel.entities.Classes;

import java.time.LocalTime;

public class Checkin {
    private int quantidadediarias;
    private LocalTime dataCheckin;
    private LocalTime dataCheckout;
    private String cidade;
    private double valorTotal;

    public Checkin(int hospedes, LocalTime dataCheckin, LocalTime dataCheckout, String cidade, double valorTotal, Quartos quartoEscolhido) {

        this.valorTotal = valorTotal;
    }
    public int getQuantidadediarias(){
        return quantidadediarias;
    }

    public LocalTime getDataCheckin() {
        return dataCheckin;
    }

    public LocalTime getDataCheckout() {
        return dataCheckout;
    }
    public String getCidade(){
        return cidade;
    }
    public double calcularDesconto(){
        if (quantidadediarias >=5){
            return valorTotal * 0.10;
        }
        return 0;
    }
    public double valorFinal(){
        return valorTotal - calcularDesconto();
    }

}