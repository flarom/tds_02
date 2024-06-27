// Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou
// não de um novo produto lançado no mercado. Para isso, forneceu o sexo do
// entrevistado e sua resposta (sim ou não). Sabendo-se que foram entrevistadas 10
// pessoas, fazer um programa que calcule e escreva: O número de pessoas que
// responderam sim O número de pessoas que responderam não A porcentagem de
// pessoas do sexo feminino que responderam sim A porcentagem de pessoas do sexo
// masculino que responderam não.
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEntrevistados = 10;
        int sim = 0;
        int nao = 0;
        int mulherSim = 0;
        int homemNao = 0;

        for (int i = 0; i < totalEntrevistados; i++) {
            System.out.print("Informe o sexo do entrevistado (F/M): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("A pessoa gostou do produto? (sim/nao): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("sim")) {
                sim++;
                if (sexo == 'F' || sexo == 'f') {
                    mulherSim++;
                }
            } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                nao++;
                if (sexo == 'M' || sexo == 'm') {
                    homemNao++;
                }
            }
        }

        System.out.println("Número de pessoas que responderam sim: " + sim);
        System.out.println("Número de pessoas que responderam não: " + nao);

        double prcntMulherSim = (double) mulherSim / totalEntrevistados * 100;
        double prcntHomemNao = (double) homemNao / totalEntrevistados * 100;

        System.out.println("Porcentagem de mulheres que responderam sim: " + prcntMulherSim + "%");
        System.out.println("Porcentagem de homens que responderam não: " + prcntHomemNao + "%");

        scanner.close();
    }
}
