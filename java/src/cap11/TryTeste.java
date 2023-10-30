package cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryTeste {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int resultado = 0;
    try {
      int valor1 = scanner.nextInt();
      int valor2 = scanner.nextInt();

      resultado = valor1 / valor2;
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getClass());
      System.out.println(e);
      System.out.println("não insira o valor Zero na divisão");
    } catch (InputMismatchException e) {
      System.out.println("Digite somente numeros inteiros, por favor!!!!");
    }
    System.out.println("O resultado é: " + resultado);


    try {
      int valor1 = scanner.nextInt();
      int valor2 = scanner.nextInt();

      resultado = valor1 / valor2;
    } catch (ArithmeticException | InputMismatchException e) { // tipo mais e
      System.out.println(e);
      System.out.println("Valor invalido. Digite um numero inteiro entre 1 a 10.000");
    } catch (RuntimeException e) { //  RuntimeException em tempo de execução

    }
  }


}
