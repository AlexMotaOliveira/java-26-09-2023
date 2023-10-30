package cap08;

import cap07.Aluno;

public class TesteArrays {

  public static void main(String[] args) {

    int valor1 = 5;
    int valor2 = 2;
    int valor3 = 52;
    int valor4 = 63;
    int valor5 = 30;
    int valor6 = 25;
    int valor7 = 52;

    int[] array;  // null
    array = new int[10]; // 10 elemento
    int array1[] = new int[3]; // 3 index

    // index 0
    array1[0] = 56;
    array1[1] = 30;
    array1[2] = 4;

    int[] array2 = {56, 30, 4, 10, 6}; // 4 index 0 a 3

//    array2[4] = 50; não é possivel acessar/atribuir um valor fora do index

    for (int i = 0; i < array2.length; i++) {
      System.out.print(array2[i]);
      System.out.print(" ");
    }

    //foreach
    for (int cadaItem : array2) {
      System.out.println(cadaItem);
    }

    System.out.println();

    System.out.println(array2[3]);

    Aluno[] alunos = new Aluno[5];

    alunos[0] = new Aluno("Alex", 10, 23658);
    alunos[1] = new Aluno("Jose");

    alunos[0].imprimir();

    int[][] nota = new int[3][2];

    // turma 0
    // turma 1
    // turma 2
    //   x  y
    nota[0][0] = 5;
    nota[0][1] = 10;

    nota[1][0] = 10;
    nota[1][1] = 10;

    nota[2][0] = 3;
    nota[2][1] = 4;

    for (int x = 0; x < nota.length; x++) {

      for (int y = 0; y < nota[x].length; y++) {

        System.out.print(nota[x][y]);
        System.out.print(" ");
      }
      System.out.println();
    }


// [unidade][turma][aluno]=
    int[][][] notas = new int[3][2][3];

    notas[0][0][0] = 1;
    notas[0][0][1] = 1;
    notas[0][0][2] = 1;

    notas[0][1][0] = 2;
    notas[0][1][1] = 2;
    notas[0][1][2] = 2;

    notas[1][0][0] = 3;
    notas[1][0][1] = 3;
    notas[1][0][2] = 3;

    notas[1][1][0] = 4;
    notas[1][1][1] = 4;
    notas[1][1][2] = 4;

    notas[2][0][0] = 5;
    notas[2][0][1] = 5;
    notas[2][0][2] = 5;

    notas[2][1][0] = 6;
    notas[2][1][1] = 6;
    notas[2][1][2] = 6;

    System.out.println("------------------");
    for (int x = 0; x < notas.length; x++) {
      // 3
      for (int y = 0; y < notas[x].length; y++) {
        //2
        for (int z = 0; z < notas[x][y].length; z++) {
          //3
          //                     1  0  0
          System.out.print(notas[x][y][z]);
          System.out.print(" ");
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println();


    int[] array10 = {56, 30, 4, 10, 6}; // 4 index 0 a 3
    int[] array11 = new int[]{56, 30, 4, 10, 6}; // 4 index 0 a 3

    //foreach
    System.out.println("foreach");

    int resultado = 0;
    for (int cadaItem : array10) {
      resultado += cadaItem;
      System.out.println("soma a cada iteração: " + resultado);
    }

    for (String item: args) {
      System.out.println("parametro do metodo main: " + item);
    }
  }

}
