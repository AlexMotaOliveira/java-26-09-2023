package cap15.empresa;

public class EmpresaTeste {

  public static void main(String[] args) {

  Empresa alexSA = new Empresa("AlexSA");

    alexSA.adicionarProduto(new Produto(1234, "leite", 100, 10));
    alexSA.adicionarProduto(new Produto(1235, "pão", 4000, 100));
    alexSA.adicionarProduto(new Produto(1236, "ovo", 3000, 100));

    alexSA.getNome();
    alexSA.getProdutoMap().forEach((key, value) -> {
      System.out.print(key + " ");
      System.out.println(value);
    } );

    alexSA.excluirProduto(1236);

    System.out.println("após exclusão do produto de codigo 1236");
    alexSA.getProdutoMap().forEach((key, value) -> {
      System.out.print(key + " ");
      System.out.println(value);
    } );

    System.out.println("lista somente de chaves");
    alexSA.retornarListaCodigo().forEach(codigo -> System.out.println(codigo));

    System.out.println("lista somente de valores");
    alexSA.retornarListaProdutos().forEach(produto -> System.out.println(produto));

    System.out.println("quantidade de produtos na empresa: " +  alexSA.tamanhoListaProdutos());

    System.out.println("existe um produto com o codigo: 1236 " + alexSA.existeProduto(1234));

  }
}
