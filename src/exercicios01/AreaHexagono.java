package exercicios01;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class AreaHexagono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##.00");

        System.out.println("Digite o valor do lado:");

        float lado = sc.nextFloat();
        double raiz = Math.sqrt(3);
        Double area = (6 * lado * lado * raiz) / 4;
        area = Double.valueOf(df.format(area));

        System.out.println("Area do hexagono plano: " + area);
    }
}
