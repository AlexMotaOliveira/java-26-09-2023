package cap06.laboratorio;

import cap06.Calculadora;

public class Cap6_Lab2 {

  public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    System.out.println(calc.subtrair(10, 10));
    System.out.println(calc.subtrair(10L, 10L));
    System.out.println(calc.subtrair(10, 10.5));
    System.out.println(calc.subtrair(10.5, 10.1));
    System.out.println(calc.subtrair(10.5, 1));


  }
}
