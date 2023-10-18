package cap15;

import java.util.ArrayList;
import java.util.List;

public class ListaTeste {

  public static void main(String[] args) {

    int[] array; // array.length
    List<String> paises = new ArrayList<>(); // 10 posições
//    ArrayList<String> paisesArraylista = new ArrayList<>(); // 10 posições
//    List<String> paisesVetor = new VectorString(8000);
//    List<String> paisesListaencadeada = new LinkedList<>(100);

    paises.add("Brasil"); // 0
    paises.add("Portugal"); // 1
    paises.add(2, "Italia"); // 2 ele add na posição
    paises.add("Estados Unidos"); // 3
    paises.add("França"); // 4
    paises.add("Inglaterra"); // 5
    paises.add("Inglaterra"); // 5
    paises.add("Inglaterra"); // 7
    paises.add("Inglaterra"); // 8
    paises.add("Inglaterra"); // 9

    String paisBrasil = paises.get(1);  //paises[1]

    boolean contem = paises.contains("Brasil");

    int indexOfPais = paises.indexOf("Brasil"); // 0

    String pais = paises.get(indexOfPais); // Brasil

    if (indexOfPais >= 0) {
      System.out.println(paises.get(indexOfPais));
    } else {
      System.out.println("Pais não existe na lista");
    }

    System.out.println("O tamanho da lista é: " + paises.size());

    System.out.println("---- foreach");
    for (String cadaPais : paises) {
      System.out.println(cadaPais);
    }

    System.out.println("---- for raiz");
    for (int i = 0; i < paises.size(); i++) {
      System.out.println(paises.get(i));
    }

    paises.replaceAll(paisReplace -> "-" + paisReplace.toUpperCase());

    paises.sort((x, y) -> x.compareTo(y));

    paises.remove("Brasil"); // não achou
    paises.remove(0);

    paises.clear();

    System.out.println("---- foreach interface funcional");
    paises.forEach(paisForEach -> {
      System.out.print("Cada pais da lista: ");
      System.out.println(paisForEach);
    });

  }
}
