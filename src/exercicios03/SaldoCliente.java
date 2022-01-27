package exercicios03;

import java.util.Scanner;

public class SaldoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero da conta do cliente:");
        int contaCliente = sc.nextInt();

        System.out.println("Informe o saldo da conta do cliente:");
        double saldoContaCliente = sc.nextDouble();

        System.out.println("Informe o valor de debito da conta do cliente");
        double debitoCliente = sc.nextDouble();

        System.out.println("Informe o valor de credito da conta do cliente");
        double creditoCliente = sc.nextDouble();

        double saldoAtual = (saldoContaCliente + debitoCliente + creditoCliente);

        if(saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
