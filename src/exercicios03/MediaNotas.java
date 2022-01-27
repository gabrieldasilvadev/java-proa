package exercicios03;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do aluno:");
        System.out.println("Primeira nota:");
        float nota1 = sc.nextFloat();
        System.out.println("Segunda nota:");
        float nota2 = sc.nextFloat();
        System.out.println("Terceira nota:");
        float nota3 = sc.nextFloat();
        System.out.println("Quarta nota:");
        float nota4 = sc.nextFloat();

        double media = (nota1+nota2+nota3+nota4) / 4;

        System.out.println("A media no primeiro ano foi de: " + media);

        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
