package cap10;

public class AppCalculadora {

  public static void main(String[] args) {

    Calculadora calculadora = new Calculadora();

    double valor = calculadora.potenciar(2, 3); // 2 * 2 * 2

    System.out.println(valor);

    Soma soma = new Calculadora();
    Subtracao subtracao = new Calculadora();
    Divisao divisao = new Calculadora();

    soma.soma(10, 10);
    divisao.dividir(10, 10);
    subtracao.subtrair(10, 10);


  }
}
