package cap15.empresa;

public class TestaProduto {

  public static void main(String[] args) {

    Produto leite = new Produto(1234, "leite", 100, 10);

    System.out.println(leite);

    leite.setQuantidade(50); // sobreescrevendo
    System.out.println(leite);

    leite.adicionarQuantidadeProduto(200); // add ao valor que já tem de quantidade
    System.out.println(leite);

    leite.subtrairQuantidadeProduto(300);
    System.out.println(leite);

    System.out.println(leite.quantidadeMinimaEstoque());



  }
}
