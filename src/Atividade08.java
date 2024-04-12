import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        // 08 - Desenvolva um programa que pede ao usuário para digitar um ano e verifica se é bissexto ou não. Um ano é bissexto se for divisível por 4, 
        // mas não por 100, a menos que também seja divisível por 400.
        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe o ano desejado: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }

    scanner.close();
    }
}