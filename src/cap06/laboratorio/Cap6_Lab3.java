package cap06.laboratorio;

public class Cap6_Lab3 {

  public static void main(String[] args) {

    Aluno joao = new Aluno();
    joao.setNome("João");
    joao.contadorDeAlunos += 1;
    joao.imprimeAluno();

    Aluno maria = new Aluno();
    maria.setNome("Maria");
    maria.contadorDeAlunos++;
    maria.imprimeAluno();

    Aluno marcos = new Aluno();
    marcos.setNome("Marcos");
    marcos.contadorDeAlunos++;
    marcos.imprimeAluno();

    System.out.println("Contador contador classe: " + Aluno.contadorDeAlunos);

    joao.imprimeAluno();
    maria.imprimeAluno();
    marcos.imprimeAluno();


  }
}
