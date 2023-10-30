package cap02;

public class Variaveis {

  public static void main(String[] args) {

    // tipo da variavel  nome da variavel = atribuição

    byte variavel1, variavel2, variavel3;
    variavel1 = 1;
    variavel2 = 2;
    variavel3 = 3;

    byte variavel4 = 1 , variavel5 = 62, variavel6= 10;

    int inteiro;
    inteiro = 10;

    int Inteiro;
    Inteiro = inteiro;

    byte dia = 6;
    short mes = 12;
    int ano = 2023;
    long idade = 250_000_000_000_000_000L;

    System.out.println(dia);

    float valorFloat = 4.5F;
    final double valorDouble = 10.9;

    char caracter = 'A';

    caracter = 'B';

    boolean falso = false;
    boolean verdadeiro = true;

    System.out.println("Ola \n \"mundo\"  \\  \f \t \b \r");

    System.out.println("mundo");

    valorFloat = 60.0f;
//    valorDouble = 45; valor final não pode ser modificado

    byte valor1 = 127;
    short valor2 = 32_767;
    int valor_3 = 2_147_483_647;
    long valor_4 = 1_223_372_036_854_775_807L;

    // cast implicito byte> short > int > long
    // cast explicito long > int > short > byte

    short valor5 = (short) 2_147_483_647;
    int valor6 = (int) valor_4;

    System.out.println("valor_3: " + valor_3);
    System.out.println("valor5: " + valor5);
    System.out.println("valor6: " + valor6);

    double valor7 = 12.5;

    int valor8 = (int)valor7;
    System.out.println("valor7: " + valor8);

    String texto = "Esse é um \n texto maior que um caracter";

    DiaDaSemana segunda = DiaDaSemana.SEGUNDA;
    System.out.println(segunda);

    DiaDaSemana sab = DiaDaSemana.SABADO;
    System.out.println(sab);

  }
}

