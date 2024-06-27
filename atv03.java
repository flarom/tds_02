import java.text.DecimalFormat;
import java.util.Scanner;
public class atv03 {
    /*
    Um canal de notícias internacionais, previa temperatura máxima para
    Brasília de 85 graus Farenheit. Escrever um programa que lhe permita
    converter esta temperatura (e qualquer outra) para graus Celsius, sabendo
    que a relação entre elas é C=5/9*(F–32).
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double celsius = 0;
        double farenheit = 0;

        System.out.println("Digite o valor em farenheit: ");
        farenheit = sc.nextDouble();

        celsius = (farenheit - 32) / 1.8;

        System.out.println(farenheit + "F° = " + df.format(celsius) + "C°");
        sc.close();
    }
}
