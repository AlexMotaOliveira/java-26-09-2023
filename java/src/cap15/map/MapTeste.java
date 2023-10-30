package cap15.map;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {

  public static void main(String[] args) {


//    List<String> index, Set<Integer> hash
//      chave    valor
    Map<Integer, Produto> produtos = new HashMap<>();
    Produto produto = new Produto("Leito em pó", "Laticinios", 10.00, 3216);
    Produto produto2 = new Produto("Banana", "Fruta", 30.00, 6589);

    produtos.put(3216, produto);
    produtos.put(6589, produto2);
//    produtos.put(3216, produto2);
    produtos.put(1234, new Produto("Tomate", "Fruta", 3.00, 1234));

    Produto getMapProduto = produtos.get(6589);
    System.out.println(getMapProduto);

    produtos.forEach((chave, valor) -> {
        System.out.print("codigo: " + chave + ", ");
        System.out.println(valor);
      }
    );

//    produtos.remove(3216);
//    produtos.remove(6589, produto2);

    produtos.size(); // tamanho da lista

//    produtos.clear();

    boolean chave= produtos.containsKey(6589);
    boolean valor= produtos.containsValue(produto2);
    if (produtos.isEmpty()){
      System.out.println("lista vazia");
    }

    produtos.keySet().forEach(key -> System.out.println(key));

    System.out.println("**************");

    produtos.values().forEach(cadaProduto -> System.out.println(cadaProduto));

  }
}
