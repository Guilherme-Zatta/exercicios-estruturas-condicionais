import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        // 04 - Desenvolva um programa que verifica se um número é divisível por 7.
        Scanner scanner = new Scanner (System.in);

        int divisor;
        int quociente;
        int resto;

        System.out.println("Informe um numero: ");
        int dividendo = scanner.nextInt(); 

        divisor = 7;
        quociente = dividendo / divisor; // resultado 8
        // módulo da divisão - operador %
        resto = dividendo % divisor; // resultado 1

        if (resto == 0) 
            System.out.println("é divisível por 7");
        else 
            System.out.println("não é divisível por 7");
        
    scanner.close();
    }
}