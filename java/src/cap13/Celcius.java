package cap13;

public class Celcius {

  public static double converterFahrenheit(double grau) {
    //  (celsius  * 1.8) + 32;
    return (grau * 1.8) + 32;
  }

  public static Double converterFahrenheit(Double grau) {
    //  (celsius  * 1.8) + 32;
    if (grau != null) {
      return (grau * 1.8) + 32;
    } else {
      return null;
    }
  }
}
