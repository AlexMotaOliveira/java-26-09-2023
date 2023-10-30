package cap05.laboratorio.cap5lab2;

public class Garagem {

  public Carro carroPasseio;
  public Carro carroUtilitario;

  public static void main(String[] args) {

    Garagem g = new Garagem();

    g.carroPasseio = new Carro();

    g.carroPasseio.potencia = 1.8;
    g.carroPasseio.cor = "azul";
    g.carroPasseio.modelo = "Fusca";

    g.carroPasseio.imprimir();

    Carro carro2 = new Carro();

    carro2.potencia = 1.8;
    carro2.cor = "rosa";
    carro2.modelo = "Fiorino";

    g.carroUtilitario = carro2;

    g.carroUtilitario.imprimir();


  }

}
