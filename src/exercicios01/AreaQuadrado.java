package exercicios01;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a area do quadrado:");
        int lado = sc.nextInt();

        int area = lado * lado;

        System.out.println("Area do quadrado: " + area);
    }
}
