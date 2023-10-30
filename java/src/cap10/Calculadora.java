package cap10;

public class Calculadora implements Soma, Subtracao, Divisao, Multiplicacao, Soma2, Potencia {


  @Override
  public int dividir(long valor1, long valor2) {
    return (int) (valor1 / valor2);
  }

  @Override
  public int multiplicar(long valor1, long valor2) {
    return (int) (valor1 * valor2);
  }

  @Override
  public int soma(long valor1, long valor2) {
    return (int) (valor1 + valor2);
  }


  @Override
  public int subtrair(long valor1, long valor2) {
    return (int) (valor1 - valor2);
  }

  @Override
  public int soma(int valor1, int valor2) {
    return valor1 + valor2;
  }

  @Override
  public double potenciar(int valor1, int valor2) {
    double resultado = 1;
    for (int i = 0; i < valor2; i++) {
      resultado *= valor1;
    }
    return resultado;
  }
}
