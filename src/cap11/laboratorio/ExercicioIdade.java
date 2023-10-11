package cap11.laboratorio;

import java.util.Scanner;

public class ExercicioIdade {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int ano = 0;
    do {
      System.out.print("Digite o ano do seu nascimento: ");
      String texto = scanner.nextLine();
      try {
        ano = Integer.parseInt(texto);
        int idade = 2023 - ano;
        System.out.println("Sua idade é: " + idade);
      } catch (NumberFormatException e) {
        e.printStackTrace();
        System.out.println();
      }
    } while (ano == 0);

  }
}

