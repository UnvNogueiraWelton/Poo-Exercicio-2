package programa;

import java.util.Scanner;

class Resposta7 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    int n = 0;

    for(int i = 0; i < 15 ; i++) {
      System.out.printf("Insira a idade da %d pessoa: ", i + 1);
      n += scan.nextInt();
    }

    float mediaIdade = (float)n / 15;

    scan.close();
    System.out.printf("Media das idades: %.2f", mediaIdade);
  }
}