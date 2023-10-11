package cap11;

import java.util.Scanner;

public class TryException {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String texto = scanner.nextLine();

    try {
      int resultado = converterString(texto);
    } catch (NumeroInvalidoException e) {
      System.out.println(e);
    }

    System.out.println("**************");

  }

  private static int converterString(String texto) throws NumeroInvalidoException {
    try {
      return Integer.parseInt(texto);
    } catch (NumberFormatException e) {
//      throw new NumeroInvalidoException("insira um numero Valido");
      throw new NumeroInvalidoException("insira um numero Valido", e); // não verificado não checado
    }
  }
}
