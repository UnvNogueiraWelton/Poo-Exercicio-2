package programa;

import java.util.Scanner;

class Resposta5 {
  public static void main(String ...args) {
    String[] days = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta"};

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um numero de 1 a 7: ");
    int n = scan.nextInt();

    scan.close();

    try {
      String day = days[n - 1];
      System.out.println(day);
    } catch (Exception ex) {
      System.out.println("Dia Invalido");
    }
  }
}