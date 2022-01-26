package exercicios02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####,###.00");

        System.out.println("Informe o salario mensal (R$):");
        double salarioMensal = sc.nextDouble();

        System.out.println("Informe o percentual de reajuste (%):");
        double percentualReajuste = sc.nextDouble();

        double novoSalario = salarioMensal + (salarioMensal * (percentualReajuste / 100));
        System.out.println("Novo salario: " + df.format(novoSalario) + "R$");
    }
}

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.✅