import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        // 01 - Escreva um programa que recebe o ano de nascimento de uma pessoa e verifica se é maior de idade ou não (considerando que a maioridade seja aos 18 anos).
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int ano = scanner.nextInt();

        if (ano < 2006) {
            System.out.println("Maior de idade!");
        }else {
            System.out.println("Menor de idade!");
        }

    scanner.close();
    }
}