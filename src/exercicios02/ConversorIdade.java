package exercicios02;

import java.util.Scanner;

public class ConversorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os anos:");
        int idade = sc.nextInt();

        System.out.println("Informe a quantidade de meses:");
        int meses = sc.nextInt();

        System.out.println("Informe a quantidade de dias:");
        int dias = sc.nextInt();

        int anosParaDias = idade*365;
        int mesesParaDias = meses*30;

        int idadeEmDias = anosParaDias + mesesParaDias + dias;

        System.out.println("A idade informada tem " + idadeEmDias + " dias no total");
    }
}

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.✅