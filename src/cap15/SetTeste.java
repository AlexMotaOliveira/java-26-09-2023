package cap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTeste {

  public static void main(String[] args) {


    Set<String> paises = new HashSet<>();
//    TreeSet<String> paises = new TreeSet<>();

    paises.add("Brasil"); // 0
    paises.add("Portugal"); // 1
    paises.add("Italia"); // 2 ele add na posição
    paises.add("Estados Unidos"); // 3
    paises.add("França"); // 4
    paises.add("Inglaterra"); // 5
    paises.add("Inglaterra"); // 7
    paises.add("Inglaterra"); // 8
    paises.add("Inglaterra"); // 9

    paises.contains("");
    paises.remove("");
    paises.clear();

    Iterator<String> iterator = paises.iterator();

    while (iterator.hasNext()) {
      String pais = iterator.next();
      if (pais == "Brasil")
        System.out.println(pais);
    }

    paises.forEach(pais -> {
      if (pais == "Brasil") {
        System.out.println(pais);
      }
    });


  }
}
