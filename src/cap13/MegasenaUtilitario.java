package cap13;

import java.util.Random;

public class MegasenaUtilitario {

  public static int sortearNumero(int max) {

    // Controller
    // assinatura
    // metdos
    // x // validar isso ou aquilo
    // y //


//    Random random = null;  // NPE NullPointerException

    Random sorteador = new Random();
    int numero = sorteador.nextInt(max) + 1; // 1 até 60
//    System.out.println(random.nextInt()); // bug critico classe A

    if (true){

    }else {

    }
    return numero;
  }






  public static int sortearNumero() {
    Random sorteador = new Random();
    int numero = sorteador.nextInt(61); // 0 até 60
    if (numero == 0) {
      numero++;
    }
    return numero;
  }
}
