package cap09.laboratorio;

public class Cap9_Lab1 {

  public static void main(String[] args) {


    Pessoa professor = new Professor(2000f, "Programação",
      "Alex", 30, 'm', 12365875, "05102003");

    professor.mostrarDados();
//    System.out.println(professor.getNome());
    professor.falar("Ola");

    Pessoa aluno1 = new Aluno("Programação", 300.99f,
      "João", 30, 'm', 65874589, "10092003");

    aluno1.mostrarDados();
    aluno1.falar("Estou aqui");

    Pessoa aluno2 = new Aluno("Programação", 300.99f,
      "Maria", 20, 'f', 1456468, "10092001");

    aluno2.mostrarDados();
    aluno2.falar("Boa noite");


  }
}
