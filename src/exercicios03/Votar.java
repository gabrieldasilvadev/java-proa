package exercicios03;

import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano atual:");
        int anoAtual = sc.nextInt();

        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = sc.nextInt();

        int diferenca = anoAtual - anoNascimento;

        if(diferenca >= 18) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Nao vota!");
        }
    }
}
