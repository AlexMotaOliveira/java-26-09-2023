package cap15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    paises.forEach(System.out::println);


  }
}
