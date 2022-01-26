package exercicios02;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comissao = 0.05;

        System.out.println("Informe o valor do salario fixo:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe o valor da venda:");
        double valorVenda = sc.nextDouble();

        System.out.println("Informe quantos carros foram vendidos:");
        int carrosVendidos = sc.nextInt();

        double bonusVenda = valorVenda * comissao;
        System.out.println("Bonus da venda: " + bonusVenda);

        double bonusTotal = bonusVenda * carrosVendidos;
        System.out.println("Bonus total: " + bonusTotal);

        double salarioFinal = salarioFixo + bonusTotal;
        System.out.println("Salario final do funcionario: " + salarioFinal + "R$");
    }
}

// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor. ✅