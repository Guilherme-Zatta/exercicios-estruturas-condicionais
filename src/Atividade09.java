import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        // Faça um programa que recebe a altura e o sexo (M/F) de uma pessoa e verifica se ela está dentro dos padrões de altura considerados normais para o sexo 
        //informado (homens com altura entre 160 e 190 cm, mulheres entre 150 e 180 cm).
         Scanner scanner = new Scanner(System.in);
 
        System.out.println("Informe sua Altura : ");
        double  Altura = scanner.nextDouble();
       
        System.out.println("Informe sua Sexo : ");
        String  Sexo = scanner.nextLine();
 
       
 
 
    scanner.close();
         
    }
}