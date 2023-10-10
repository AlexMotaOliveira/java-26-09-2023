package cap10;

public class Geladeira implements Eletrodomestico {

  private String temperatura;

  @Override
  public void ligar() {
    System.out.println("ligando a geladeira");
  }

  @Override
  public void desligar() {
    System.out.println("desligando a geladeira");
  }

  public void descongelar() {
    System.out.println("descongelando");
  }
}
