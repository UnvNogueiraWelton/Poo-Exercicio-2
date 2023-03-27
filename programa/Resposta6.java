package programa;

import java.util.Scanner;

class Resposta6 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    int n = 0;

    for(int i = 0; i < 10 ; i++) {
      System.out.printf("Insira o %d numero: ", i + 1);
      n += scan.nextInt();
    }

    scan.close();
    System.out.printf("Total: %d", n);
  }
}