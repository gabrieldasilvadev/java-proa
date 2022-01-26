package exercicios01;

import java.util.Scanner;

public class Multipliacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        float numero1 = sc.nextInt();

        System.out.println("Informe o segundo valor:");
        float numero2 = sc.nextInt();

        float resultado = numero1 * numero2;
        System.out.println("Resultado da multiplicacao: " + resultado);
    }
}
