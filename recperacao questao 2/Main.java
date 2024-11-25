import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // exercicio 1
    // Solicitando o primeiro numero
    // System.out.println("Digite um numero: ");
    // double numero = scanner.nextDouble();
    // if (numero>=0){
    // System.out.println("O numero é positivo");
    // }else{
    // System.out.println("O numero é negativo");
    // }
    // scanner.close();

    // exercicio 2
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scanner.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = scanner.nextInt();

    if (numero1 > numero2) {
      System.out.println("os  numeros são iguais");
    } else if (numero1 > numero2) {
      System.out.println("o numero 1 e maior que o numero 2");
    } else {
      System.out.println("o numero 2 e maior que o numero 1");
    }
    scanner.close();
  }
}