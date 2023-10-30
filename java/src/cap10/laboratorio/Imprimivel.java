package cap10.laboratorio;

public interface Imprimivel {

  public static final int variavel = 10; // tem constantes  | não tem atributos

  abstract void imprimivel(); // contrato sem corpo, sem definição no metodo

  default void salvar(String nome) {
    System.out.println("Salvando o " + nome);
  }

  static void imprimirVarArgs(Imprimivel... lista) { // varargs
    for (Imprimivel item : lista) {
      imprimirItem(item);
    }
  }

  static void imprimirArray(Imprimivel[] lista) {
    for (Imprimivel item : lista) {
      imprimirItem(item);
    }
  }

  private static void imprimirItem(Imprimivel item){
    item.imprimivel();
  }
}
