import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        // 10 - Crie um programa que recebe o salário de um funcionário e verifica se ele está acima do salário mínimo atual.
        Scanner scanner = new Scanner (System.in);

        double salarioMinimo = 1412;

        System.out.print("Informe o salário de um funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        if (salarioMinimo < salarioFuncionario) {
            System.out.printf("O salário deste funcionário está acima do salário mínimo atual!" + salarioFuncionario);
        }
    
    scanner.close();
    }
}
