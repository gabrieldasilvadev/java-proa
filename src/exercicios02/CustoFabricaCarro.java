package exercicios02;

import java.util.Scanner;

public class CustoFabricaCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do carro:");
        double valorCarro = sc.nextDouble();

        double distribuidor = 0.28;
        double impostos = 0.45;

        double valoresAdicionais = (valorCarro * distribuidor) + (valorCarro * impostos);
        double valorFinal = valorCarro + valoresAdicionais;
        System.out.println("Valor final do carro: " + valorFinal+"R$");
    }
}

//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor. ✅