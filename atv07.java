
/*
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
 * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - 
 * débito + crédito). Também testar se saldo atual for maior ou igual a 
 * zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 
 * 'Saldo Negativo'.
 */
import java.util.Scanner;

public class atv07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCliente = 0;
        double saldo = 0, debito = 0, credito = 0, saldoAtual = 0;

        System.out.println("Informe o numero do cliente:");
        numCliente = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o saldo do cliente " + numCliente + ":");
        saldo = scan.nextDouble();
        scan.nextLine();

        System.out.println("Informe o debito do cliente " + numCliente + ":");
        debito = scan.nextDouble();
        scan.nextLine();

        System.out.println("Informe o crédito do cliente " + numCliente + ":");
        credito = scan.nextDouble();
        scan.close();

        saldoAtual = saldo - (credito + debito);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
            return;
        }
        System.out.println("Saldo Negativo");
    }
}
