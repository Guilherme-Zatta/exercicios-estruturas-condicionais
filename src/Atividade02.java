import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        // 02 - Crie um programa que recebe a idade de uma pessoa e verifica se ela é menor de idade (menor que 18 anos) ou maior de idade.
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Informe sua idade: ");
        int Idade = scanner.nextInt();
 
        if (Idade > 18) {
            System.out.println("Maior de idade!");
        }else {
            System.out.println("Menor de idade!");
        }
 
    scanner.close();
    }
}
