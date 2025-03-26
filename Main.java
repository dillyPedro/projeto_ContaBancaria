package Ex_Conta_Bancaria;

import Aula_Pratica04.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(122342.1, 1023, 500.00, "Pedro Dilly", "11111111111", 25, "M"); // Criando uma conta;
        Cliente cliente2 = new Cliente(12212.2, 1024, 0.00, "Osvaldo Santos", "22222222222", 64, "M"); // Criando outra conta;
        cliente1.setStatus(); // Alterei o status da conta cliente1 para aberta;
        cliente2.setStatus(); // Alterei o status da conta cliente2 para aberta;

        cliente1.depositar(500.00);
        cliente1.infosConta(); // Retornando os valores da conta cliente1;
        System.out.println("\n");
        cliente2.infosConta();

        cliente1.transferir(cliente2, 700.00);
        System.out.println("\n");

        cliente1.infosConta();
        System.out.println("\n");
        cliente2.infosConta();

    }
}
