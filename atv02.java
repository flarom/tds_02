/*
O critério de notas semestrais numa faculdade consiste em dois bimestres, sendo que,
cada nota varia de 0 a 10 e tem os respectivos pesos 4 e 6. Elabore um algoritmo que
leia as notas bimestrais, calcule e escreva a media semestral.
*/
import java.util.Scanner;

public class atv02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();
        
        int peso1 = 4;
        int peso2 = 6;
        
        double mediaSemestral = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
        
        System.out.println("A média semestral é: " + mediaSemestral);
        
        scanner.close();
    }
}

