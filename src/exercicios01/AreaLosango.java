package exercicios01;

import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da diagonal maior:");
        double diagonalMaior = sc.nextDouble();

        System.out.println("Digite o valor da diagonal menor:");
        double diagonalMenor = sc.nextDouble();

            double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("Area do losango: " + area);
    }
}
