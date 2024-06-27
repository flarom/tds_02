
/*
Em uma danceteria o preço da entrada sofre variações. Segunda, Terça e Quinta
 (2, 3 e 5), ela oferece um desconto de 25% do preço normal de entrada. Nos dias 
 de músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao 
 preço normal da entrada. Fazer um programa que leia o preço normal da entrada, 
 o dia da semana (1 a 7) e se é dia de música ao vivo (1) ou não (2). Calcular e 
 imprimir o preço final que deverá ser pago pela entrada. 
 */
import java.util.Scanner;

public class atv09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço de entrada:");
        double preco = scan.nextDouble();

        System.out.println("Informe o dia da semana (1 dom - 7 sab):");
        int dia = scan.nextInt();

        if (dia <= 0 || dia > 7) {
            scan.close();
            return;
        }

        System.out.println("Informe se há música ao vivo (1 sim - 2 não):");
        int musicaAoVivo = scan.nextInt();
        scan.close();

        if (musicaAoVivo < 1 || musicaAoVivo > 2)
            return;

        double porcentDia = 1;
        double porcentMusica = 1;

        if (dia == 2 || dia == 3 || dia == 5) {
            porcentDia = 0.25;
        }
        if (musicaAoVivo == 1) {
            porcentMusica = -0.15;
        }

        double precoTotal = preco * porcentDia * porcentMusica;
        System.out.println(precoTotal);
    }
}
