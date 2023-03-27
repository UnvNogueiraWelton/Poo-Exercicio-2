package programa;

import java.util.Scanner;

class Resposta3 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um numero: ");
    int n = scan.nextInt();

    scan.close();

    System.out.printf("O numero lido e %s", n == 0 ? "NULO" : n > 0 ? "POSITIVO" : "NEGATIVO");
  }
}