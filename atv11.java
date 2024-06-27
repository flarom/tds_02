
// Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a
// seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
// Escrever o menor elemento do vetor e a respectiva posição dele nesse vetor.
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qTamanho = 20;
        int[] q = new int[qTamanho];

        for (int i = 0; i < qTamanho; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            int novoNumero = sc.nextInt();
            sc.nextLine();
            if (novoNumero >= 0) {
                q[i] = novoNumero;
            } else {
                sc.close();
                return;
            }
        }

        sc.close();

        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < qTamanho; i++) {
            if (q[i] > maior) {
                maior = q[i];
                posicao = i + 1;
            }
        }

        System.out.println("O maior numero é " + maior + ", na posição " + posicao);
    }
}
