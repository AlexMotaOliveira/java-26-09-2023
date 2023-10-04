package cap06;



public class Teste {

  public static void main(String[] parametros) {

//    System.out.println("bem vindo " + parametros[0]);

    Calculadora calculadora = new Calculadora();


    long valor1 = 10;
    long valor2 = 20;

    long resultadoSoma = calculadora.somar(valor2, valor1);
    System.out.println(resultadoSoma);

    double resultadoDivisao = calculadora.dividir(3,10);

    long resultadoSubtracao = calculadora.subtrair(10 , 9);
    System.out.println(resultadoSubtracao);

    String texto = calculadora.concatenar("parte1 ", "parte2 texto");

//    System.out.println(calculadora.concatenar("parte1 ", "parte2 texto"));
    System.out.println(texto);

    Aluno aluno = new Aluno();
    aluno.setNome("Alex");
    aluno.setMatricula(123456);
    aluno.setIdade(15);

    System.out.println(aluno.getNome());


//    aluno.nome = "Alex";

    aluno.imprimir();


    Calculadora.somar(23.3, 24.6);
    Calculadora.somar(23.3, Calculadora.PI);

    System.out.println(Calculadora.PI);
    Calculadora calculadora1 = new Calculadora();
    calculadora1.nome = "Calcular";
    System.out.println(calculadora1.nome);

    System.out.println(calculadora1.PI);

    Calculadora.PI = 2.33;

    System.out.println(Calculadora.PI);

    Calculadora calculadora2 = new Calculadora();
    System.out.println(calculadora2.PI);
    calculadora2.nome = "Somar";
    System.out.println(calculadora2.nome);

    Calculadora calculadora3 = new Calculadora();
    System.out.println(calculadora3.PI);
    calculadora3.nome = "Multiplicar";
    System.out.println(calculadora3.nome);

  }
}
