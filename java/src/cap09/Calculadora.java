package cap09;

public abstract class Calculadora {

  public abstract int somar(int valor1, int valor2);

  public abstract int subtrair(int valor1, int valor2);

  public abstract int dividir(int valor1, int valor2);

  public abstract int multiplicar(int valor1, int valor2);

  // sobreEscrita de metodo na mesma classe
  // sobreEscrita sempre na mesma classe
  public long somar(long valor1, long valor2){
    return valor1 + valor2;
  }

}
