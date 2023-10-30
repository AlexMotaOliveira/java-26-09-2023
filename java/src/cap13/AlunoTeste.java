package cap13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// junit5
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // regra de ordenação
public class AlunoTeste {

  private static Aluno aluno;

  @BeforeAll
  static void inicarAntesDeTodosOsTest() {
    // executar 1
    System.out.println("criando uma vez somente o objeto Aluno");
    setAluno(new Aluno("Programação", 300.99f,
      "Maria", 20, 'f', 1456468, "10092001"));
  }

  @BeforeEach
  void inicarAntesDeCadaTest() {
    // executar 3
    System.out.println("criando a cada execução dos metodos o objeto Aluno");
    setAluno(new Aluno("Programação", 300.99f,
      "Maria", 20, 'f', 1456468, "10092001"));
  }

  @AfterAll
  static void executadoAoFinalDeTodosOsTest() {
    System.out.println("Acabou todos os testes");
  }

  @AfterEach
  void executadoAoFinalDeCadaOsTest() {
    System.out.println("Acabou um teste");
  }

  @Test
  @Order(2)
  void validarAlunoNulo() {
    Assertions.assertNotNull(aluno);
    System.out.println(aluno);
    System.out.println(aluno.hashCode());

  }

  @Test
  @DisplayName("validarAlunoNulo2")
  @Order(1)
    // definir a ordem
  void validarAlunoNulo2() {

    Assertions.assertNotNull(aluno);
    System.out.println();
    System.out.println(aluno);
    System.out.println(aluno.hashCode());
  }

  @Test
  void validarAlunoNulo3() {
    Assertions.assertNotNull(aluno);
    System.out.println(aluno);
    System.out.println(aluno.hashCode());
  }

  // não é obrigatorio
  public static Aluno getAluno() {
    return aluno;
  }

  public static void setAluno(Aluno aluno) {
    AlunoTeste.aluno = aluno;
  }
}
