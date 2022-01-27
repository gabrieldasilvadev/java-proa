package exercicios03;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor:");
        double valor = sc.nextDouble();

        if(valor >= 0) {
            System.out.println("Positivo!");
        } else {
            System.out.println("Negativo");
        }
    }
}
