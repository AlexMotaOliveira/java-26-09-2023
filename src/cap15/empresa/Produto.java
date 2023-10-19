package cap15.empresa;

public class Produto {

  private Integer codigo;
  private String nome;
  private Integer quantidade; // 100 + 10 = 110
  private Integer quantidadeMinimaEstoque;

  public Produto(Integer codigo, String nome, Integer quantidade, Integer quantidadeMinimaEstoque) {
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
    this.quantidadeMinimaEstoque = quantidadeMinimaEstoque;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    // this.quantidade = 100
    // this.quantidade = quantidade 300
    this.quantidade = quantidade;
  }

  public Integer getQuantidadeMinimaEstoque() {
    return quantidadeMinimaEstoque;
  }

  public void setQuantidadeMinimaEstoque(Integer quantidadeMinimaEstoque) {
    this.quantidadeMinimaEstoque = quantidadeMinimaEstoque;
  }

  public Integer adicionarQuantidadeProduto(Integer quantidade) {
//    int somaQuantidade = this.quantidade + quantidade;
//    return somaQuantidade;
//    return this.quantidade = this.quantidade + quantidade;
    return this.quantidade += quantidade;
  }

  public Integer subtrairQuantidadeProduto(Integer quantidade) {
    int resultado = this.quantidade - quantidade;
    if (resultado >= 0) {
      this.quantidade = resultado;
      return this.quantidade;
    }
    // TODO: 18/10/2023 criar uma classe de exception para essa regra
    throw new RuntimeException("quantidade " + quantidade + " é superior ao estoque informado, estoque: " + this.quantidade);
  }

  public boolean quantidadeMinimaEstoque() {
    return quantidade <= quantidadeMinimaEstoque;
  }

  @Override
  public String toString() {
    return "Produto{" +
      "codigo=" + codigo +
      ", nome='" + nome + '\'' +
      ", quantidade=" + quantidade +
      ", quantidadeMinimaEstoque=" + quantidadeMinimaEstoque +
      '}';
  }
}
