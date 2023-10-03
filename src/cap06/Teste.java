package cap06;

public class Teste {

  public static void main(String[] args) {

    Calculadora calculadora = new Calculadora();

    int resultadoSoma = calculadora.somar(10, 20);
    System.out.println(resultadoSoma);

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

  }
}
