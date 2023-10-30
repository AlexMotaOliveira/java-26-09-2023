package cap04.laboratorio;

public class Laboratorio5 {

  public static void main(String[] args) {

    /*
    5-Crie um código que recebe 2 números e multiplica o num1 pelo num2
    através de somas repetidas. (ex: 2 e 3 = 2 + 2 + 2);
     */

    int numero1 = 4;
    int numero2 = 3;
    int soma = 0;

    System.out.print("ex: " + numero1 + " e " + numero2 + " = ");
    for (int i = 0; i < numero2; i++) {
      System.out.print(numero1);
      if (i < numero2 -1 ){
        System.out.print(" + ");
      }
    }
  }
}
