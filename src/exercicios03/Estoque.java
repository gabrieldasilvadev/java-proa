package exercicios03;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade atual em estoque:");
        int quantidadeAtualEstoque = sc.nextInt();

        System.out.println("Informe a quantidade maxima em estoque:");
        int quantidadeMaximaEstoque = sc.nextInt();

        System.out.println("Informe a quantidade minima em estoque:");
        int quantidadeMinimaEstoque = sc.nextInt();

        int quantidadeMediaEstoque = (quantidadeMaximaEstoque + quantidadeMinimaEstoque)/2;

        if(quantidadeAtualEstoque >= quantidadeMediaEstoque) {
            System.out.println("Nao efetuar compra!");
        } else {
            System.out.println("Efetuar compra!");
        }
    }
}
