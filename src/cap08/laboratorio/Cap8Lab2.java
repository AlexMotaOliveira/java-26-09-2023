package cap08.laboratorio;

public class Cap8Lab2 {

  public static void main(String[] args) {

    int soma = 0;

    if (args.length == 0) {
      System.out.println("não tem nada no args");
      return;
    }

    for (int i = 0; i < args.length; i++) {
      soma += Integer.parseInt(args[i]);
    }
    int media = soma / args.length;
    System.out.println("a soma da media: " + media);
  }
}
