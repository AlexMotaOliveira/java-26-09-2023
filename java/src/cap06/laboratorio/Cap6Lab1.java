package cap06.laboratorio;

import cap06.Calculadora;

public class Cap6Lab1 {

  public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    System.out.println("calc.somar(6,3) = " + calc.somar(6, 3));
    System.out.println("calc.subtrair(6, 3) = " + calc.subtrair(6, 3));
    System.out.println("calc.multiplicar(6, 3) = " + calc.multiplicar(6, 3));
    System.out.println("calc.dividir(6, 3) = " + calc.dividir(6, 3));

    int resultadoSoma = calc.somar(6, 3);
    int resultadoSubtracao = calc.subtrair(6, 3);
    double resultadoDivisao = calc.dividir(6, 3);
    long resultadoMultiplicao = calc.multiplicar(6, 3);

    System.out.println("calc.somar(6,3) = " + resultadoSoma);
    System.out.println("calc.subtrair(6, 3) = " + resultadoSubtracao);
    System.out.println("calc.multiplicar(6, 3) = " + resultadoMultiplicao);
    System.out.println("calc.dividir(6, 3) = " + resultadoDivisao);

  }
}
