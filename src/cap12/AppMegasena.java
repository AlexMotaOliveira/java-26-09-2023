package cap12;

public class AppMegasena {

  /**
   * javadoc
   * @author Alex Mota
   *
   * @param args lista de argmentos que podem se passados na execução do pacote
   * @see  String
   * @implNote classe que executa o sorteio da megaSena
   */
  public static void main(String[] args) {
    /**
     * @see MegasenaUtilitario
     */

    for (int i = 0; i < 6; i++) {
      int numero = MegasenaUtilitario.sortearNumero(60);
      MegasenaUtilitario.numerosSorteados(60, 10);
      System.out.println(numero);
    }
  }

}
