package Controle_Inteligente.application;

import Controle_Inteligente.entities.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("Quantos produtos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int i = 0;

        while (i < n) {

            System.out.println("Produto " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade no estoque: ");
            int quantidadeEstoque = sc.nextInt();
            sc.nextLine();

            produtos.add(new Produto(nome, preco, quantidadeEstoque));

            i++;
        }

        System.out.println(" DADOS DOS PRODUTOS ");
        i = 0;
        while (i < produtos.size()) {
            System.out.println(produtos.get(i));
            i++;
        }

        sc.close();
    }
}