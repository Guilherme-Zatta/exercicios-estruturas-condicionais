import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        // 06 - Crie um programa que pede ao usuário para digitar sua nota em uma disciplina e imprime se ele foi aprovado (nota maior ou igual a 6) ou reprovado.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua nota:");
        Double Nota = scanner.nextDouble();
 
        if (Nota > 6) {
            System.out.println("Aprovado !");
        }else{
            System.out.println("Reprovado OnO!");
        }

    scanner.close();
    }
}