package cap04;

public class Switch {

  public static void main(String[] args) {

    String mes = "jan";

    switch (mes){

      case "set" : {} break;

      case "jan" : {
        System.out.println("O mes digitado: ");
        System.out.println("Janeiro");
        break;
      }
      case "fev" : System.out.println("Fevereiro"); break;
      case "mar" : System.out.println("Março"); break;
      case "abr" : System.out.println("Abril");  break;
      case "mai" : System.out.println("Maio");  break;
      case "jun" : System.out.println("Junho");  break;
      case "jul" : System.out.println("Julho"); break;

      default:
        System.out.println("não tem o mes informado");
    }

  }
}
