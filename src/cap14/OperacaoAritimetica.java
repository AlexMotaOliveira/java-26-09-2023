package cap14;

@FunctionalInterface // somente um metodo abstrato
public interface OperacaoAritimetica {

  double executar(double valor1, double valor2);

//  double executar(long valor1, long valor2);

//  default double executar(long valor1, long valor2){
//    return executar(valor1,valor2);
//  }
//
//  private static double executar(int valor1, long valor2){
//    return valor1 + valor2;
//  }
}
