package cap13;

import cap09.laboratorio.Aluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// junit5
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // regra de ordenação
public class MegasenaTeste {

  private static Aluno aluno;

  @BeforeAll
  static void inicarAntesDeTodosOsTest() {
    // executar 1
    System.out.println("BeforeAll: Iniciando conexão com out banco");
    aluno = new Aluno("Programação", 300.99f,
      "Maria", 20, 'f', 1456468, "10092001");
  }

//  @BeforeEach
//  void inicarAntesDeCadaTest(){
//    // executar 3
//    System.out.println("BeforeEach: Iniciando conexão com out banco");
//  }

  @Test
  @Order(2)
  void valorMenorZeroTeste() {
    // given dado = 60
    // when quando = sortearNumero(60)
    // then resultado = 0 entre 60
    int numero = MegasenaUtilitario.sortearNumero(60);
    Assertions.assertFalse(numero <= 0);
    Assertions.assertFalse(numero > 60); // 61
    Assertions.assertTrue(numero > 0 && numero <= 60);
    Assertions.assertNotNull(aluno);
    System.out.println(aluno);
    System.out.println(aluno.hashCode());

  }

  @Test
  @DisplayName("Testa Lista De Numeros")
  @Order(1)
    // definir a ordem
  void listaDeNumerosMegasenaTest() {
    int max = 1000;
    for (int i = 0; i < max; i++) {
      int numero = MegasenaUtilitario.sortearNumero(max);
      System.out.print(numero + " ");
      Assertions.assertTrue(numero > 0 && numero <= max);
    }
    Assertions.assertNotNull(aluno);
    System.out.println();
    System.out.println(aluno);
    System.out.println(aluno.hashCode());
  }

  @Test
  void testeFalse() {
    int numero = MegasenaUtilitario.sortearNumero(60);
    Assertions.assertTrue(true);
    Assertions.assertNotNull(aluno);
    System.out.println(aluno);
    System.out.println(aluno.hashCode());
  }

  @Test
  void validadorNumerosMega() {

    int[] array = MegasenaUtilitario.numerosSorteados();

    for (int i = 0; i < array.length; i++) {
      int index_i = array[i];
      for (int j = 0; j < array.length; j++) {

        int index_j = array[j];
        // caso o index de i e j sejam iguais, não devemos validar pq é o mesmo valor
        if (i != j && index_i == index_j) {
          Assertions.fail("Valor já existente!!!");
        }
      }
    }
  }

}
