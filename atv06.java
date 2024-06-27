import java.util.Scanner;

public class atv06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        int horasSemanais = 40;
        int horasMensais = horasSemanais * 4;
        
        double salarioTotal;
        
        if (horasTrabalhadas <= horasMensais) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - horasMensais;
            double salarioNormal = horasMensais * salarioPorHora;
            double salarioHoraExtra = horasExtras * salarioPorHora * 1.5;
            salarioTotal = salarioNormal + salarioHoraExtra;
        }
        
        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
        
        scanner.close();
    }
}
