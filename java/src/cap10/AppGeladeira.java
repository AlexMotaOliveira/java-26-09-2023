package cap10;

public class AppGeladeira {

  public static void main(String[] args) {

    Eletrodomestico geladeira = new Geladeira();
    geladeira.ligar();
    geladeira.desligar();

    Eletrodomestico televisao = new Televisao();
    televisao.ligar();
    televisao.desligar();

    Televisao televisao2 = new Televisao();
    televisao2.trocarCanal();

    // cast de objetos somente por herença ou interface
    Televisao televisao3 = (Televisao) televisao;
    televisao3.trocarCanal();


    int voltagem = Eletrodomestico.voltagem;

    Eletrodomestico.ligar(geladeira, televisao2, televisao3, televisao);
  }
}
