package cap15.laboratorio;

import java.util.ArrayList;

public class Cap15_Lab02 {
  public static void main(String[] args) {

    ArrayList<Estudante> estudanteArrayList = new ArrayList<>();

    estudanteArrayList.add(new Estudante("Joana", 8.5, 8.5));
    estudanteArrayList.add(new Estudante("Antônio", 6.0, 9.0));
    estudanteArrayList.add(new Estudante("Mariana", 7.5, 9.0));
    estudanteArrayList.add(new Estudante("Ricardo", 7.0, 6.0));
    estudanteArrayList.add(new Estudante("Gustavo", 9.5, 10.0));

    System.out.println("Calcula e exibi o nome e média dentro do mesmo lambda");
    estudanteArrayList.forEach(estudante -> {
      estudante.setMedia(((estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2));
      System.out.println(estudante.getNome() + ": " + estudante.getMedia());
    });

    System.out.println("\nCalcula e exibi o nome e média em lambdas diferentes");
    estudanteArrayList.forEach(estudante -> {
      estudante.setMedia(((estudante.getNotaMatematica() + estudante.getNotaPortugues()) / 2));
    });

    estudanteArrayList.forEach(estudante -> {
      System.out.println(estudante.getNome() + ": " + estudante.getMedia());
    });
  }
}
