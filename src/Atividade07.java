import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        // 07 - Faça um programa que recebe um caractere do usuário e verifica se é uma vogal ou consoante.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma letra): ");
        char letra = scanner.next().charAt(0);
 
        if (letra == 'A' || letra == 'a' ||
            letra == 'E' || letra == 'e' ||
            letra == 'I' || letra == 'i' ||
            letra == 'O' || letra == 'o' ||
            letra == 'U' || letra == 'u') {
            System.out.printf("%c é uma vogal", letra);
    }   else {
            System.out.printf("%c é uma consoante", letra);
            }
    scanner.close();
    }
}