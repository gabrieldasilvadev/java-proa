package exercicios01;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        int sucessor = numero + 1;
        System.out.println("Sucessor: " + sucessor);
    }
}
