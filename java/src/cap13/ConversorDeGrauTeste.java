package cap13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversorDeGrauTeste {


  // TDD
  @Test
  void validarTemperatura() {
    // 18 == 64,4
    double fahrenheit = Celcius.converterFahrenheit(18);
    Assertions.assertTrue(fahrenheit == 64.4);

  }

  @Test
  void validarTemperaturaNula() {
    // 18 == 64,4
    Double graus = null;
    Double fahrenheit = Celcius.converterFahrenheit(graus);
    Assertions.assertNull(graus);
    Assertions.assertNull(fahrenheit);

  }
}
