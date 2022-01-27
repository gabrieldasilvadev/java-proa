package exercicios03;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double valor1 = sc.nextDouble();

        System.out.println("Informe o segundo valor");
        double valor2 = sc.nextDouble();

        if(valor1 != valor2) {
            if(valor1 > valor2){
                System.out.println("O maior valor e: " + valor1);
            } else {
                System.out.println("O maior valor e: " + valor2);
            }
        } else {
            System.out.println("Os valores nao podem ser iguais!");
        }
    }
}
