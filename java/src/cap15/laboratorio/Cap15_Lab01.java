package cap15.laboratorio;

import java.util.HashMap;

public class Cap15_Lab01 {

  public static void main(String[] args) {

    HashMap<String, Integer> pessoaMap = new HashMap<>();

    pessoaMap.put("123456789-89", 37);
    pessoaMap.put("Jão", 60);
    pessoaMap.put("Maria", 40);
    pessoaMap.put("Jose", 30);

    System.out.println("-- Pessoas --");
    System.out.println("123456789-89: " + pessoaMap.get("123456789-89"));
    System.out.println("Jão: " + pessoaMap.get("Jão"));
    System.out.println("Maria: " + pessoaMap.get("Maria"));
    System.out.println("Jose: " + pessoaMap.get("Jose"));

    System.out.println("-- Pessoas lambda--");

    pessoaMap.forEach((nome, idade) -> {
      System.out.print(nome + ": ");
      System.out.println(idade);
    });

  }
}
