package cap14;

@FunctionalInterface // somente um metodo abstrato
public interface OperacaoAritimetica2 {

  double executar(double valor1, double valor2, String texto);

}
