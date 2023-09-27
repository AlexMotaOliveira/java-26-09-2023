package cap03;

import cap02.DiaDaSemana;

public class Operadores {

  public static void main(String[] args) {

    int valor1 = 10;
    int valor2 = 20;

    int somaSomar = 10 + 20;
    int soma2 = valor1 + valor2;
    int subtracao = valor1 - valor2;
    int divisao = valor1 / 2;
    int multiplicacao = valor1 * valor2;
    int modulo = 10 % 3;
    int divisãoInteiro = valor1 / 3;
    double divisãoDouble = (int)10D / 3;

    System.out.println(somaSomar);
    System.out.println(soma2);
    System.out.println(subtracao);
    System.out.println(divisao);
    System.out.println(multiplicacao);
    System.out.println(modulo);
    System.out.println(divisãoInteiro);
    System.out.println(divisãoDouble);

    int valor3 = 10;
    valor3 = valor3 + 1;
    System.out.println(valor3);
    valor3 += 2;
    valor3 -= 10;
    valor3 /= 10;
    valor3 *= 10;
    valor3 %= 10;
    System.out.println(valor3);

    System.out.println("**********");
    int valor4 = 5;
    System.out.println(valor4++); // imprimir 5 e somar 1 = 6
    System.out.println(++valor4); // somar 1 = 7; imprimir 7
    System.out.println(valor4--); // imprimir 7 e subtrair 1 = 6
    System.out.println(--valor4); // subtrair 1 = 5; imprimir 5


    int valor5 = 10;
    int valor6 = 10;

    boolean relacional1 = valor5 > valor6; // 10 > 10 false
    boolean relacional2 = valor5 < valor6; // 10 < 10 false
    boolean relacional3 = valor5 >= valor6; // 10 >= 10 true
    boolean relacional4 = valor5 <= valor6; // 10 >= 10 true
    boolean relacional5 = valor5 == valor6; // 10 == 10 true
    boolean relacional6 = valor5 != valor6; // 10 != 10 false
    boolean relacional7 = (valor5 != valor6 && valor2 > valor1) || valor5 <= valor3; // 10 != 10 false

    boolean relacional8 = valor5 == valor6 && valor2 >= valor1; // (10==10)true &&  (20>=10)true = true
    boolean relacional9 = valor5 != valor6 && valor2 >= valor1; // (10!=10)false && (20>=10)true = false
    boolean relacional10 = valor5 == valor6 && valor2 < valor1; // (10==10)true && && (20<10)false = false

    boolean relacional11 = valor5 == valor6 || valor2 >= valor1; // (10==10)true &&  (20>=10)true = true
    boolean relacional12 = valor5 != valor6 || valor2 >= valor1; // (10!=10)false && (20>=10)true = true
    boolean relacional13 = valor5 == valor6 || valor2 < valor1; // (10==10)true && && (20<10)false = true
    boolean relacional14 = valor5 != valor6 || valor2 < valor1; // (10!=10)false && && (20<10)false = false

    boolean relacional15 = valor5 == valor6 ^ valor2 >= valor1; // (10==10)true &&  (20>=10)true = false
    boolean relacional16 = valor5 != valor6 ^ valor2 >= valor1; // (10!=10)false && (20>=10)true = true
    boolean relacional17 = valor5 == valor6 ^ valor2 < valor1; // (10==10)true && && (20<10)false = true
    boolean relacional18 = valor5 != valor6 ^ valor2 < valor1; // (10!=10)false && && (20<10)false = false

    boolean relacional19 = !true; // false
    boolean relacional20 = !false; // true

    boolean relacional21 = !(valor5 != valor6) ^ !(valor2 < valor1); // !(10!=10)true && && !(20<10)true = false
    boolean relacional22 = !relacional21; // true

    String versao = "23.3.4";
    long versaoAppNumero = 2334;
    long featureA = 2345;
    long featureB = 2300;

    boolean feature1 = versaoAppNumero > featureA; // false
    boolean feature2 = versaoAppNumero > featureB; // true

    boolean feature3 = feature1 || feature2; // false

    String ternario1 = 10 > 9 ? "verdadeiro" : "falso"; // true
    String ternario2 = 10 < 9 ? "verdadeiro" : "falso"; //  false

    DiaDaSemana ternario3 = !(valor5 != valor6) ^ !(valor2 < valor1) && feature1 ^ feature2 ?
      DiaDaSemana.TERCA : DiaDaSemana.QUARTA; //  false


    if(26 == 26){
      ternario3 = DiaDaSemana.TERCA;
    }else {
      ternario3 = DiaDaSemana.QUARTA;
    }

  }
}
