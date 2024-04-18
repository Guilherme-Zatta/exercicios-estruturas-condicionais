import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        // 10 - Crie um programa que recebe o salário de um funcionário e verifica se ele está acima do salário mínimo atual.
        Scanner scanner = new Scanner (System.in);

        double salarioMinimo = 1412;

        System.out.print("Informe seu salário: ");
        double salarioFuncionario = scanner.nextDouble();

        if (salarioFuncionario > salarioMinimo) {
            System.out.printf("Seu salário está acima do salário mínimo atual! (R$%.2f)", salarioFuncionario);
         } else { System.out.printf("Seu salário está abaixo do salário mínimo atual! (R$%.2f)", salarioFuncionario);
        }
    
    scanner.close();
    }
}
