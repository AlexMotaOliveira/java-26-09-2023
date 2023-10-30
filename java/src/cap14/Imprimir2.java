package cap14;

@FunctionalInterface
public interface Imprimir2 {

  void imprmirConsole();

  static void imprimir(double valor1) {
    System.out.println(valor1);
  }
}
