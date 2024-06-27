// Escreva um algoritmo que procure por um determinado elemento em um vetor e
// imprima quantas vezes ele aparece no vetor (caso ele esteja no vetor). Seu
// algoritmo deve, inicialmente, ler os valores e armazená-los em um vetor de 16
// posições.
import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        int[] vetor = new int[16];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 16; i++){
            System.out.println("Informe o numero " + (i+1) + "/16");
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }

        int pesquisa = sc.nextInt();
        int resultados = 0;
        sc.close();
        
        for(int i = 0; i < 16; i++){
            if(vetor[i] == pesquisa){
                resultados++;
            }
        }
        System.out.println(resultados + " resultados");
    }
}
