package cap04;

import cap05.Aluno;
import cap05.TesteAluno;

public class While {

  public static void main(String[] args) {

    int numero = 10;

    while (--numero > 0) {

      System.out.println("o valor do numero é: " + numero);
//      System.out.println("o valor do numero é: " + numero--);
//      System.out.println("o valor do numero é: " + ++numero);

//      numero = numero - 1;
//      numero -= 2;
      numero--;

    }

    do {
      System.out.println("o valor do numero é: " + numero);
    } while (--numero > 0);

    Aluno aluno = new Aluno();
    TesteAluno testeAluno = new TesteAluno();
  }
}
