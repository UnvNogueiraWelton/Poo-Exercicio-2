package programa;

import java.util.Scanner;

class Resposta1 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o primeiro numero: ");
    int n1 = scan.nextInt();

    System.out.println("Insira o segundo numero: ");
    int n2 = scan.nextInt();

    scan.close();

    System.out.printf("O maior numero lido foi: %d", n1 > n2 ? n1 : n2);
  }
}