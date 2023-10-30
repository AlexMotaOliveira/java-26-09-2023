package cap13;

public class AppMegasena {

  public static void main(String[] args) {

    for (int i = 0; i < 6; i++) {
      int numero = MegasenaUtilitario.sortearNumero(60);
      System.out.println(numero);
    }
  }
}
