import java.util.Scanner;
 
public class Atividade03 {
    public static void main(String[] args) {
        // 03 - Faça um programa que solicita ao usuário a temperatura em graus Celsius e converte para Fahrenheit seguindo a fórmula: F = (C * 9/5) + 32.
        // Certifique-se de que o programa imprime uma mensagem de alerta caso a temperatura em Celsius seja menor que -273.15 (zero absoluto).
        Scanner scanner = new Scanner(System.in);
   
    System.out.println("Informe a temperatura em ºC: ");
    double C = scanner.nextDouble();
       
   
     double f = 33.8;
 
     double  formula =   f = (C * 9/5) + 32;
   
     if (formula < -273.15) {
        System.out.printf(" ALERTA zero absoluto %f  ", formula);
     }else{
        System.out.printf("Conversão é:   %f  ", formula);
     }

   scanner.close();
   }

}