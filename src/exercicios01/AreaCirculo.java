package exercicios01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##.00");

        System.out.println("Informe o raio do circulo:");
        double raio = sc.nextFloat();
        double area = 3.14 * raio * raio;
        area = Double.parseDouble((df.format(area)));

        System.out.println("Area do circulo: " + area);
    }
}
