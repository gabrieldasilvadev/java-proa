package exercicios03;

import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora de inicio:");
        int horaInicio = sc.nextInt();

        System.out.println("Informe a hora de termino");
        int horaFim = sc.nextInt();

        int duracao = horaFim - horaInicio;

        if( duracao > 24) {
            System.out.println("Excedeu o tempo limite de jogo!");
        }

        if(duracao > 1) {
            System.out.println("Duracao do jogo: " + duracao + " horas");
        } else {
            System.out.println("Duracao do jogo: " + duracao + " hora");
        }
    }
}
