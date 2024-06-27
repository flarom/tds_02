// Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e
// escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas
// mesmas posições.
import java.util.Scanner;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.println("Informe o numero " + (i+1) + "/15");
            v1[i] = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0; i < 15; i++){
            System.out.println("Informe o numero " + (i+1) + "/15");
            v2[i] = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0; i < 15; i++){
            if(v1[i] == v2[i]){
                System.out.println(v1[i] + " encontrado na posição " + (i+1));
            }
        }
    }
}
