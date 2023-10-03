package cap06;

public class Calculadora {

  public int somar(int valor1, int valor2){
    int resultado = valor1 + valor2;
    return resultado;
  }

  public long somar(long valor1, long valor2){
    long resultado = valor1 + valor2;
    return resultado;
  }

  public int somar(int valor1, int valor2, int valor3){
    int resultado = valor1 + valor2 + valor3;
    return resultado;
  }

  public long subtrair(long valor1, long valor2) {
    return valor1 - valor2;
  }

  public String concatenar(String texto1, String texto2){
    return texto1 + texto2;
  }
}
