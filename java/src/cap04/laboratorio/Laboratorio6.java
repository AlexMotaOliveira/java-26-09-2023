package cap04.laboratorio;

public class Laboratorio6 {

  public static void main(String[] args) {

    /*
    6- Implemente um código que leia um número e realize a soma dos números entre zero e o número lido.
     */


    int numero = 6;
    int soma = 0;

    for (int i = 0; i <= numero; i++){
      soma += i;
      // 0 + 0 = 0 + 1 = 1 + 2 = 3 + 3 = 6 + 4 = 10 + 5 = 15 + 6 = 21
    }
    System.out.println("a soma do numero é: " + soma);
  }
}
