package programa;

import java.util.Scanner;

class Resposta9 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    int maior = 0;
    int menor = 0;

    for(int i = 0; i < 10 ; i++) {
      System.out.printf("Insira a %d nota: ", i + 1);

      int buffer = scan.nextInt();

      if(buffer > maior) {
        maior = buffer;
      }

      if(i == 0 || buffer < menor) {
        menor = buffer;
      }
    }

    scan.close();
    System.out.printf("Maior nota: %d\nMenor nota: %d", maior, menor);
  }
}