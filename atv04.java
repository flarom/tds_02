import java.util.Scanner;
public class atv04 {
    /*
    Escreva um algoritmo para ler o número total de eleitores de um município, o número
    de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
    representa em relação ao total de eleitores.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalEleitores = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int votosValidos = 0;

        System.out.println("Informe o total de votos brancos:");
        votosBrancos = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Informe o total de votos nulos:");
        votosNulos = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Informe o total de votos validos:");
        votosValidos = sc.nextInt();
        sc.close();
        
        totalEleitores = votosBrancos + votosNulos + votosValidos;
        if(totalEleitores <=0) return;

        double totalEleitoresDouble = totalEleitores;

        double validosPrct = (votosValidos / totalEleitoresDouble) * 100;
        double nulosPrct = (votosNulos / totalEleitoresDouble) * 100;
        double brancosPrct = (votosBrancos / totalEleitoresDouble) * 100;

        System.out.println("VLD % " + validosPrct);
        System.out.println("NUL % " + nulosPrct);
        System.out.println("BRC % " + brancosPrct);

    }
}
