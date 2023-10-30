package cap07;

import java.util.Date;

public class TesteConstrutor {

  public static void main(String[] args) {

    Aluno aluno1 = new Aluno("Jose");
//    aluno1.setNome("Jose"); desnecessario
    aluno1.getNome();

    Aluno aluno2 = new Aluno("Daiane", 30);
    Aluno aluno3 = new Aluno("Alex", 50, 3145878);

    aluno3 = new Aluno("Maria", 50, 3145878);

    Aluno aluno4 = new Aluno(125489);

    Aluno aluno5 = new Aluno();

    Aluno aluno6 = new Aluno("Alex", 50, 3145878, new Date());


    System.out.println();

  }
}
