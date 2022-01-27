package exercicios03;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double valor1 = sc.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = sc.nextDouble();

        if (valor1 != valor2) {
            if(valor1 > valor2) {
                System.out.println("Ordem: " + valor2 + " - " + valor1);
            } else {
                System.out.println("Ordem: " + valor1 + " - " + valor2);
            }
        } else {
            System.out.println("Os valores nao podem ser iguais!");
        }
    }
}
