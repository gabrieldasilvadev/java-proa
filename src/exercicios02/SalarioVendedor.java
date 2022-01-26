package exercicios02;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.println("Informe o valor do salario fixo:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe um valor fixo para a comissao de cada venda de carro:");
        double comissao = sc.nextDouble();

        System.out.println("Informe o valor da venda:");
        double valorVenda = sc.nextDouble();

        System.out.println("Informe quantos carros foram vendidos:");
        int carrosVendidos = sc.nextInt();

        // Processamento
        double bonusCarroVendido = carrosVendidos * comissao;
        System.out.println("Bonus da comissao: " + bonusCarroVendido);

        double bonusVenda = valorVenda * 0.05;
        System.out.println("Bonus de venda: " + bonusVenda);

        double valorFinal = salarioFixo + bonusCarroVendido + bonusVenda;

        //Saida
        System.out.println("Salario final do funcionario: " + valorFinal + "R$");
    }
}

// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor. ✅