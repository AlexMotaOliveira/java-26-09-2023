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

    if (true) {

    } else {

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

  //TODO
  public static int[] numerosSorteados() {

    int[] jogoMegaSena = new int[6];

    for (int i = 0; i < jogoMegaSena.length; i++) {

      boolean validador = true;
      int numeroSorteado = sortearNumero(60);

      // valida se dentro do jogoMegaSena já existe o numero sorteado
      for (int j = 0; j < jogoMegaSena.length; j++) {
        if (jogoMegaSena[i] == numeroSorteado) {
          validador = false; // muda para false para não adicionar um numero já existente
          i--; // volta o contador para a mesma posição
          break;
        }
      }
      // add um numero caso ele não exista no array
      if (validador) {
        jogoMegaSena[i] = numeroSorteado;
      }
    }
    return jogoMegaSena;
  }


  // TODO: 17/10/2023 como usar o SET e não duplicar os dados na list
  // TODO: 17/10/2023 21:35
  public static int[] numerosSorteados(int maxNumeroSorteado) {
    return null;
  }

}
