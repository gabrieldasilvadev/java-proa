package exercicios03;

import java.util.Scanner;

public class VendasEfetuadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salario fixo:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe o valor das vendas efetuadas:");
        double valorVendas = sc.nextDouble();

        double salarioFinal;
        double comissao;

        if(valorVendas <= 1500){
            comissao = valorVendas * 0.03;
            salarioFinal = salarioFixo + comissao;
            System.out.println("Salario final do funcionario: " + salarioFinal + "R$");
        } else {
            comissao = valorVendas * 0.05;
            salarioFinal = salarioFixo + comissao;
            System.out.println("Salario final do funcionario: " + salarioFinal + "R$");
        }
    }
}
