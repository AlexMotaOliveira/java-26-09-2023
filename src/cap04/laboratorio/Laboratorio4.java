package cap04.laboratorio;

public class Laboratorio4 {

  public static void main(String[] args) {

    /*
    4 - Crie um código que leia a nota de um aluno e mostre se ele está: aprovado (acima de 60),
    em recuperação (abaixo de 60) ou reprovado  (abaixo de 20).
     */

    int nota = 70;

    if (nota >= 60) {
      System.out.println("Aprovado");
    } else if (nota >= 20 && nota <= 59) {
      System.out.println("recuperação");
    } else {
      System.out.println("reprovado");
    }
  }
}
