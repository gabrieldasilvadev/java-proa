package exercicios03;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas na semana:");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Informe o salario por hora:");
        double salarioHora = sc.nextDouble();

        double salarioFinal= (horasTrabalhadas * salarioHora)*4;


        if(horasTrabalhadas <= 40) {
            System.out.println("Salario do funcionario: " + salarioFinal);
        } else {
            salarioFinal = salarioFinal + ((horasTrabalhadas - 40)*(salarioHora*1.5));

            System.out.println("Salario do funcionario: " + salarioFinal);
        }
    }
}
