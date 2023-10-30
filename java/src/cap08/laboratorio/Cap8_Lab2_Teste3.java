package cap08.laboratorio;

public class Cap8_Lab2_Teste3 {

  public static void main(String[] args) {

    if (args.length > 0) {
      int soma = 0;

      for (String i : args) {
        soma += Integer.parseInt(i);
      }
      int media = soma / args.length;

      System.out.println("A media das idades é:");
      for (String item : args) {
        System.out.print(item + " ");
      }
      System.out.println("\n é de : " + media + " anos");

    }
    else {
      System.out.println("Entre com valores válidos para as idades");
    }
  }
}
