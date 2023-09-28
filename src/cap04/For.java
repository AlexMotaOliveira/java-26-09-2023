package cap04;

public class For {

  public static void main(String[] args) {

    for (int numero = 10; numero < 1000; numero *= 2) {
      if (numero >= 40) {
        break;
      }
      System.out.println("o valor do numero é: " + numero);
    }
    System.out.println("finalizou o looping");


    for (int i = 10; i > 0; i--) {
      if (i % 2 == 0){
        continue;
      }
      System.out.print("\n primeiro for i: " + i);
      for (int j = 10; j > 0; j--) {
        System.out.print(" j: " + j);
      }
    }
  }
}
