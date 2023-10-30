package cap05;

public class TesteAluno {

  public static void main(String[] args) {

    Aluno aluno = new Aluno();

    aluno.nome = "Alex";
    aluno.idade = 15;
    aluno.matricula = 2023965878;

    System.out.println(aluno.nome);
    System.out.println(aluno.idade);
    System.out.println(aluno.matricula);
  }

}
