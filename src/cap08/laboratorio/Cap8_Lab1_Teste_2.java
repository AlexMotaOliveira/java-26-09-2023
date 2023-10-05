package cap08.laboratorio;

import java.util.Scanner;

public class Cap8_Lab1_Teste_2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];

    for (int x = 0; x < 10; x++){
      int input = scanner.nextInt();
      numeros[x] = input;
    }


    int maiorNumero = Cap8_Lab1.maiorNumero(numeros);

    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      System.out.print(" ");
    }

    System.out.println("\nMaior numeros: " + maiorNumero);

  }
}
