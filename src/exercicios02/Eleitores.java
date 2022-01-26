package exercicios02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,##.00");

        System.out.println("Informe a quantidade de votos brancos:");
        int votosBrancos = sc.nextInt();

        System.out.println("Informe a quantidade de votos nulos:");
        int votosNulos = sc.nextInt();

        System.out.println("Informe a quantidade de votos validos:");
        int votosValidos = sc.nextInt();


        double totalEleitores = (votosBrancos + votosNulos + votosValidos);
        int intTotalEleitores = (int) totalEleitores;

        System.out.println("Quantidade total de eleitores: " + intTotalEleitores);

        double porcentagemVotosBrancos =  (votosBrancos/totalEleitores)*100;
        porcentagemVotosBrancos = Double.parseDouble(df.format(porcentagemVotosBrancos));
        System.out.println("Porcentagem dos votos brancos: " + porcentagemVotosBrancos+"%");

        double porcentagemVotosNulos =  (votosNulos/totalEleitores)*100;
        porcentagemVotosNulos = Double.parseDouble(df.format(porcentagemVotosNulos));
        System.out.println("Porcentagem dos votos nulos: " + porcentagemVotosNulos+"%");


        double porcentagemVotosValidos =  (votosValidos/totalEleitores)*100;
        porcentagemVotosValidos = Double.parseDouble(df.format(porcentagemVotosValidos));
        System.out.println("Porcentagem dos votos validos: " + porcentagemVotosValidos+"%");

    }
}
//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. ✅
// Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores. ✅