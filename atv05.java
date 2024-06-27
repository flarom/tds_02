import java.util.Scanner;

public class atv05 {
    /*
     * Uma revendedora de carros usados paga a seus funcionários vendedores um
     * salário fixo por mês, mais uma comissão também fixa para cada carro vendido e
     * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
     * o número de carros por ele vendidos, o valor total de suas vendas, o salário
     * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
     * final do vendedor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdCarros = 0;
        double salario = 0;
        double comissao = 0;
        double adicional = 0.5;
        double totalVenda = 0;

        System.out.println("Informe a quantidade de carros vendida:");
        qtdCarros = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o total vendido:");

        System.out.println("Informe o salario:");
        salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o preço de comissão:");
        comissao = sc.nextDouble();
        sc.nextLine();

        totalVenda = (comissao * qtdCarros) * adicional;
        totalVenda += salario;

        System.out.println(totalVenda);
        sc.close();
    }
}
