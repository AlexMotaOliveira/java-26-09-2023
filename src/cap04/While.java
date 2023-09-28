package cap04;

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
  }
}
