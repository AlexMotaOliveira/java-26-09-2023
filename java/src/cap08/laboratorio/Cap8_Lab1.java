package cap08.laboratorio;

public class Cap8_Lab1 {

  public static int maiorNumero(int[] numeros) {
    int maiorNumero = 0;
    for (int item : numeros) {
      if (item >= maiorNumero) {
        maiorNumero = item;
      }
    }
    return maiorNumero;
  }

}
