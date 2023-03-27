package programa;

import java.util.Scanner;

class Resposta4 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a primeira nota: ");
    int n1 = scan.nextInt();

    System.out.println("Insira a segunda nota: ");
    int n2 = scan.nextInt();

    float media = ((float)n1 + (float)n2) / 2;
    System.out.printf("Media: %.2f\n", media);
    
    if(media < 7) {
      System.out.println("Insira a terceira nota: ");
      int n3 = scan.nextInt();

      if(n1 < n2) {
        media = ((float)n2 + (float)n3) / 2;
      } else {
        media = ((float)n1 + (float)n3) / 2;
      }
      System.out.printf("Media: %.2f\n", media);
    }
    
    System.out.printf("%s", media >= 7 ? "APROVADO" : "REPROVADO");
    scan.close();
  }
}