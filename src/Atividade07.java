import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        // 07 - Faça um programa que recebe um caractere do usuário e verifica se é uma vogal ou consoante.

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um caracter (Qualquer letra): ");
        char caractere = scanner.next().charAt(0);
 
        boolean ehVogal = false;
        if (caractere == 'A' || caractere == 'a'){
            ehVogal = true;
        } else {
            if (caractere == 'E' || caractere == 'e') {
                ehVogal = true;
            } else {
                if (caractere == 'I' || caractere == 'i') {
                    ehVogal = true;
                 } else {
                        if (caractere == 'O' || caractere == 'o') {
                        ehVogal = true;        
                        }else {
                            if (caractere == 'U' || caractere == 'u') {
                                ehVogal= true;
                            }else{
                                if (caractere == caractere) {
                                    System.out.println("nao e uma vogal");
                                   
                                }
                            }
                           
 
                        }
                    }
                }
            }
    scanner.close();
    }
}
