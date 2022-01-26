package exercicios01;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        double base = sc.nextInt();
        System.out.println("Informe o valor da altura:");
        double altura = sc.nextInt();

        double area = (base * altura) / 2;

        System.out.println("Area do triangulo: " + area);
    }
}
