package programa;

import java.util.Scanner;

class Resposta10 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    int masculino = 0;
    int feminino = 0;

    for(int i = 0; i < 30 ; i++) {
      System.out.printf("Insira o sexo do %d aluno (m/f): ", i + 1);

      if(scan.nextLine().charAt(0) == 'm') {
        masculino++;
      } else {
        feminino++;
      }

    }

    scan.close();
    System.out.printf("Sexo masculino: %.2f%\nSexo feminino: %.2f%", (float)masculino * 100 / 30, (float)feminino * 100 / 30);
  }
}