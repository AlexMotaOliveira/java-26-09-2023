package cap15;

public class Produto {

  private String nome;
  private String categoria;
  private Double preco;
  private int codigo;

  public Produto(String nome, String categoria, Double preco) {
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
  }

  public Produto(String nome, String categoria, Double preco, int codigo) {
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
    this.codigo = codigo;
  }

  public Produto() {

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString() {
    return "Produto{" +
      "nome='" + nome + '\'' +
      ", categoria='" + categoria + '\'' +
      ", preco=" + preco +
      ", codigo=" + codigo +
      '}';
  }
}
