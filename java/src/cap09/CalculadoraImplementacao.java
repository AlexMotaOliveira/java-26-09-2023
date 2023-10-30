package cap09;


public class CalculadoraImplementacao extends Calculadora {


  @Override // sobreCarga, sempre alterando o metodo da classe superior
  public int somar(int valor1, int valor2) {
    return valor1 + valor2;
  }

  @Override
  public int subtrair(int valor1, int valor2) {
    return valor1 - valor2;
  }

  @Override
  public int dividir(int valor1, int valor2) {
    int i = valor1 / valor2;
    return i;
  }

  @Override
  public int multiplicar(int valor1, int valor2) {
    return valor1 * valor2;
  }


}
