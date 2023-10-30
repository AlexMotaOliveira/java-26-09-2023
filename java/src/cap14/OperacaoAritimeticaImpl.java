package cap14;

public class OperacaoAritimeticaImpl implements OperacaoAritimetica, OperacaoAritimetica2 {

  @Override
  public double executar(double valor1, double valor2) {
    //(valor1,valor2) -> valor1 + valor2;
    return valor1 + valor2;
  }


  @Override
  public double executar(double valor1, double valor2, String texto) {
    double resultado = valor1 + valor2;
    System.out.println(texto + resultado);
    return resultado;
  }
}
