
/*
A prefeitura de Aparecida de Goiânia abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e
informar se o empréstimo pode ou não ser concedido. 
*/
import java.util.Scanner;

public class atv08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salario bruto:");
        double salBruto = scan.nextDouble();

        System.out.println("Informe o valor da prestação:");
        double valPrestacao = scan.nextDouble();

        scan.close();

        double fracaoSalario = salBruto * 0.3;

        if (valPrestacao <= fracaoSalario) {
            System.out.println("Emprestimo concedido");
            return;
        }
        System.out.println("Emprestimo não pode ser concedido");
    }
}
