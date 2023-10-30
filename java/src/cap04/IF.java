package cap04;

public class IF {

  public static void main(String[] args) {

    int dia = 27;

    if (dia == 27) { // true
      System.out.println("hoje é quarta");
    } else { // false
      System.out.println("Hoje não é dia 27");
    }


    int horario = 20;

    if (horario < 12) {
      System.out.println("bom dia");
    } else if (horario < 18) {
      System.out.println("boa tarde");
    } else {
      System.out.println("boa noite");
    }

    if (true) {
      System.out.println("somente um if, sem else");
    }

    if (true)
      System.out.println();

    String resultado = (11 % 2) != 0 ? "IMPAR" : "PAR";
    String resultado1 = (11 % 2) == 0 ? "PAR" : "IMPAR";

    if (11 % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    }

    if (11 % 2 != 0) {
      System.out.println("IMPAR");
    } else {
      System.out.println("PAR");
    }

  }
}
