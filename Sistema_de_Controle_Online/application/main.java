package Sistema_de_Controle_Online.application;

import Sistema_de_Controle_Online.entities.compra;

public class main {

    public static void main(String[] args) {

        compra compra = new compra();

        compra.adicionarProdutos();

        compra.dadosCliente();

        compra.calcularFrete();

        compra.finalizarCompra();
    }
}