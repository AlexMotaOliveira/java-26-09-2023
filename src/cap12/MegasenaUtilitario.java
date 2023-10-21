package cap12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MegasenaUtilitario {

  /**
   *
   * @param max
   * @return retorna um inteiro
   * @author
   *
   */
  public static int sortearNumero(int max) {
    Random sorteador = new Random();
    int numero = sorteador.nextInt(max) + 1; // 1 até 60

    if (true) {

    } else {

    }
    return numero;
  }

  /**
   *
   * @return
   * @since 1.0
   */
  public static int sortearNumero() {
    Random sorteador = new Random();
    int numero = sorteador.nextInt(61); // 0 até 60
    if (numero == 0) {
      numero++;
    }
    return numero;
  }


  /**
   *
   * @return
   * @since 1.1
   */
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


  /**
   *
   * <p>Primeira <strong>linha<strong/><p/>
   *
   * @param maxNumeroSorteado
   * @param quantidade
   * @throws MegasenaUtilitarioException
   * @return retorna uma lista {@link  Set} com numeros {@link Integer}
   * @since 1.2
   */
  public static Set<Integer> numerosSorteados(int maxNumeroSorteado, int quantidade) {
    if (maxNumeroSorteado < quantidade) {
      throw new MegasenaUtilitarioException("maxNumeroSorteado não pode ser inferior a quantidade");
    }

    Set<Integer> jogoMegaSena = new HashSet<>(quantidade);

    while (jogoMegaSena.size() < quantidade) {
      int numeroSorteado = sortearNumero(maxNumeroSorteado);
      jogoMegaSena.add(numeroSorteado);
    }
    return new TreeSet<>(jogoMegaSena);
  }

}
