package cap10;

public interface Eletrodomestico {

  int voltagem = 110;

  void ligar();

  void desligar();

  static void ligar(Eletrodomestico... lista) {
    for (Eletrodomestico item : lista) {
      item.ligar();
      imprimir();
    }
  }

  private static void imprimir() {
    System.out.println("metodo privado da interface");
  }

}
