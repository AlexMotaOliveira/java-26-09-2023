package cap08.laboratorio;

public class Cap8_Lab1_Teste {

  public static void main(String[] args) {

    int[] numeros = {10, 8, 63, 79, 1, 85, 546};

    int maiorNumero = Cap8_Lab1.maiorNumero(numeros);

    // somete para imprimir os valores e verificar o maior numero
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      System.out.print(" ");
    }

    System.out.println("\nMaior numeros: " + maiorNumero);

  }
}
