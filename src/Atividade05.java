import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        // 05 - Escreva um programa que recebe três números do usuário e imprime o maior deles.
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Informe outro número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("Informe mais um número: ");
        double terceiroNumero = scanner.nextDouble();
       
        if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)) {
            System.out.println("O maior é: " + primeiroNumero);
        } else if ((segundoNumero > terceiroNumero) && (segundoNumero > primeiroNumero)) {
            System.out.println("O maior é: " + segundoNumero);
        } else {
            System.out.println("O maior é: " + terceiroNumero);
        }

    scanner.close();
    }
}