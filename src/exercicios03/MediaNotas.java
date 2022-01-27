package exercicios03;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do aluno:");
        System.out.println("Primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Terceira nota:");
        double nota3 = sc.nextDouble();
        System.out.println("Quarta nota:");
        double nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4) / 4;

        System.out.println("A media no primeiro ano foi de: " + media);

        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
