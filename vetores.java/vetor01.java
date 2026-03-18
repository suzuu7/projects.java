import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int [5];
    System.out.println("Digite 5 números inteiros: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Posição [" + i + "]: ");
      numeros[i] = entrada.nextInt();
    }
    System.out.println("Os números digitados foram: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
    entrada.close();
  }
}