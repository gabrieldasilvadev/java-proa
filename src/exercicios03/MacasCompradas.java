package exercicios03;

import java.util.Scanner;

public class MacasCompradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorMaca;

        System.out.println("Informe a quantidade de macas:");
        int quantidadeMaca = sc.nextInt();

        if(quantidadeMaca < 12) {
            valorMaca = 1.30;
        } else {
            valorMaca = 1;
        }

        double valorTotal = quantidadeMaca * valorMaca;

        System.out.println("Custo total da compra: " + valorTotal + "R$");
    }
}
