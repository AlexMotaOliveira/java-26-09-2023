package cap04.laboratorio;

public class Laboratorio2 {

  public static void main(String[] args) {

    String mes = "abril";

    switch (mes) {
      case "janeiro":
      case "março":
      case "maio":
      case "julho":
      case "agosto":
      case "outubro":
      case "dezembro": {
        System.out.println("O mês escolhido tem 31 dias");
        break;
      }
      case "abril":
      case "junho":
      case "setembro":
      case "novembro": {
        System.out.println("O mês escolhido tem 30 dias");
        break;
      }
      case "fevereiro": {
        System.out.println("O mês escolhido tem 28 dias");
        break;
      }
      default:
        System.out.println("o mês informado não é valido");

    }
  }
}
