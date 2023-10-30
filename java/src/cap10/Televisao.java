package cap10;

public class Televisao implements Eletrodomestico{

  private int canal;
  private int volume;

  @Override
  public void ligar() {
    System.out.println("ligando a TV");
  }

  @Override
  public void desligar() {
    System.out.println("desligando a TV");
  }

  public void trocarCanal(){
    System.out.println("alterou o canal");
  }
}
