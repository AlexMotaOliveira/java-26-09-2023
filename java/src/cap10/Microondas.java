package cap10;

public class Microondas implements Eletrodomestico {



  @Override
  public void ligar() {
    System.out.println("ligando a microondas");
  }

  @Override
  public void desligar() {
    System.out.println("desligando a microondas");
  }

  public void aquecer(){
    System.out.println("aquecendo a comida");
  }

  public void assar(){
    System.out.println("assar a comida");
  }


}
