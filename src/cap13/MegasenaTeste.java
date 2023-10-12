package cap13;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // regra de ordenação
public class MegasenaTeste {

  @Test
  @Order(2)
  void valorMenorZeroTeste() {
    // given dado = 60
    // when quando = sortearNumero(60)
    // then resultado = 0 entre 60
    int numero = MegasenaUtilitario.sortearNumero(100);
    Assertions.assertFalse(numero <= 0);
    Assertions.assertFalse(numero > 60); // 61
    Assertions.assertTrue(numero > 0 && numero <= 60);
  }

  @Test
  @DisplayName("Testa Lista De Numeros")
  @Order(1) // definir a ordem
  void listaDeNumerosMegasenaTest() {
    int max = 1000;
    for (int i = 0; i < max; i++) {
      int numero = MegasenaUtilitario.sortearNumero(max);
      System.out.print(numero + " ");
      Assertions.assertTrue(numero > 0 && numero <= max);
    }
  }

  @Test
  void testeFalse() {
      int numero = MegasenaUtilitario.sortearNumero(60);
      Assertions.assertTrue(false);
  }


}
