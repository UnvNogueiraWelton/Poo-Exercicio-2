package programa;

import java.util.Scanner;

class Resposta8 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    int maior = 0;

    for(int i = 0; i < 15 ; i++) {
      System.out.printf("Insira o %d numero: ", i + 1);

      int buffer = scan.nextInt();

      if(buffer > maior) {
        maior = buffer;
      }
    }

    scan.close();
    System.out.printf("Maior numero: %d", maior);
  }
}