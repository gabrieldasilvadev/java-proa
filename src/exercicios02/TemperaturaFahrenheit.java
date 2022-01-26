package exercicios02;

import java.util.Scanner;

public class TemperaturaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit:");
        float temperaturaF = sc.nextFloat();

        float temperaturaC = (float) ((temperaturaF - 32) / 1.8);

        System.out.println("Conversao para Celcius: " + temperaturaC);
    }
}

//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo): ✅