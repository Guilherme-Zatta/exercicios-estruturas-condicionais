import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        // 09 - Faça um programa que recebe a altura e o sexo (M/F) de uma pessoa e verifica se ela está dentro dos padrões de altura considerados normais para o sexo 
        //informado (homens com altura entre 160 e 190 cm, mulheres entre 150 e 180 cm).
         Scanner scanner = new Scanner(System.in);
 
        System.out.println("Informe sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe sua Sexo: ");
        char sexo = scanner.next().charAt(0);
 
        if ((sexo == 'm' || sexo == 'M') &&
            (altura >= 160 && altura <= 190)) {
          System.out.println("Sua altura está dentro dos padrões para o sexo Masculino! ");
        } else if ((sexo == 'f' || sexo == 'F') &&
            (altura >= 150 && altura <= 180)) {
          System.out.println("Sua altura está dentro dos padrões para o sexo Feminino! ");
        } else {
          System.out.println("Sua altura está fora dos padrões! ");
        }
        scanner.close();
    }   
}