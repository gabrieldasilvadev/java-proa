package exercicios03;

import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        if(valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else if(valor < 10){
            System.out.println("NÃO É MAIOR QUE 10!");
        } else {
            System.out.println("O VALOR E 10!");
        }
    }
}
