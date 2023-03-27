package programa;

import java.util.Scanner;

class Resposta2 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um numero: ");
    int n = scan.nextInt();

    scan.close();

    System.out.printf("O numero lido e %s", n % 2 == 0 ? "PAR" : "IMPAR");
  }
}