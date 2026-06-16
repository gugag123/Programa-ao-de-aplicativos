package Java_TryCatch_ClassFinal_ClassAbstract.Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            Menu.exibirMenu(); // Menu está no mesmo pacote, sem necessidade de import

            System.out.print("Deseja realizar uma nova compra? (s/n): ");
            continuar = sc.nextLine().trim().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Obrigado pela preferência.");
        sc.close();
    }
}