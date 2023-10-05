package cap06;

public class Calculadora {

  public static double PI = 3.141592;
  public String nome;

  public int somar(int valor1, int valor2) {
    int resultado = valor1 + valor2;
    return resultado;
  }

  public long somar(long valor1, long valor2) {
    long resultado = valor1 + valor2;
    return resultado;
  }

  public int somar(int valor1, int valor2, int valor3) {
    int resultado = valor1 + valor2 + valor3;
    return resultado;
  }

  public static double somar(double valor1, double valor2) {
    return valor1 + valor2;
  }


  public long subtrair(long valor1, long valor2) {
    return valor1 - valor2;
  }

  public double subtrair(double valor1, double valor2) {
//    return (long)(valor1 - valor2);
    return valor1 - valor2;
  }

  public double subtrair(int valor1, double valor2) {
    return valor1 - valor2;
  }

  public double subtrair(double valor1, int valor2) {
    return valor1 - valor2;
  }

  public int subtrair(int valor1, int valor2) {
    return valor1 - valor2;
  }

  public double dividir(int dividendo, int divisor) {
    return dividendo / divisor;
  }

  public long multiplicar(long fator1, long fator2) {
    return fator1 * fator2;
  }

  public long multiplicar(int[] numeros) {
    int produto = 1;
    for (int item: numeros) {
      produto *= item;
    }
    return produto;
  }

  public String concatenar(String texto1, String texto2) {
    return texto1 + texto2;
  }
}
