package cap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceFuncionalApp {


  public static void main(String[] args) {


    OperacaoAritimetica soma = new OperacaoAritimeticaImpl();
    System.out.println(soma.executar(10D, 10D));

    // interface funcional não precisa de classe de implementação
    // lambda ->
    OperacaoAritimetica somaFuncional = (valor1, valor2) -> valor1 + valor2;
    System.out.println(somaFuncional.executar(10D, 10D));

//    OperacaoAritimetica interfaceFuncional = new OperacaoAritimetica() {
//      @Override
//      public double executar(double valor1, double valor2) {
//        return valor1 + valor2;
//      }
//    };

    OperacaoAritimetica subtacaoFuncional = (valor1, valor2) -> {
      return valor1 - valor2;
    };

    System.out.println(subtacaoFuncional.executar(10D, 10D));
    subtacaoFuncional.executar(10L, 10L);

    OperacaoAritimetica2 aritimetica2 = (x, y, z) -> {
      double resultado = x + y;
      System.out.println(z + resultado);
      return resultado;
    };


    double resultado = aritimetica2.executar(2, 6, "A soma é: ");

    List<String> alunos = new ArrayList<>();
    alunos.add("Alex");
    alunos.add("João");

    alunos.forEach(aluno -> System.out.println(aluno));
    alunos.forEach(System.out::println);

    for (int i = 0; i < alunos.size(); i++) {
      System.out.println(alunos.get(i));
    }

    for (String aluno : alunos) {
      System.out.println(aluno);
    }

    Imprimir imprimir = palavra -> System.out.println(palavra);
    imprimir.imprmirConsole("Minha interface funcional");

    Imprimir2 imprimir2 = () -> System.out.println("palavra");
    imprimir2.imprmirConsole();

    Consumer consumer = o -> System.out.println(o);
  }
}
