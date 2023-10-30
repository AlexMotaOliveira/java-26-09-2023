package cap11;

public class TesteNota {

  public static void main(String[] args) {


    Nota nota = null;
    try {
      nota = new Nota("Alex",  10);
    } catch (NotaInvalidaException e) {
      System.out.println(e);
    }

    System.out.println(nota.toString());
  }
}
