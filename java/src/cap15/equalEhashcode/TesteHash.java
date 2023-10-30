package cap15.equalEhashcode;

import cap15.laboratorio.Estudante;

import java.util.HashMap;

public class TesteHash {

  public static void main(String[] args) {

    boolean validar = 10 == 10;  // true

    boolean validarString = "texto" == "Texto"; // String falso


    Estudante estudante1 = new Estudante("123.456.789-11", "Alex");
    Estudante estudante2 = new Estudante("123.456.789-11", "Alex Mota");

//    estudante2 = estudante1;

    boolean objeto = estudante1 == estudante2; // false

    boolean equals = estudante1.equals(estudante2); // false

    boolean validarStringEquals = "texto".equals("texto"); // String falso

    new HashMap<String, String>().put(null, null);
    System.out.println();
  }
}
