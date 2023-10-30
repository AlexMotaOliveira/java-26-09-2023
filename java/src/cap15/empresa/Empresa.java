package cap15.empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Empresa {

  private String nome;
  private Map<Integer, Produto> produtoMap = new HashMap<>();

  public Empresa(String nome) {
    this.nome = nome;
//    this.produtoMap = new HashMap<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Map<Integer, Produto> getProdutoMap() {
    return produtoMap;
  }

  public void setProdutoMap(Map<Integer, Produto> produtoMap) {
    this.produtoMap = produtoMap;
  }

  public void adicionarProduto(Produto produto) {
    this.produtoMap.put(produto.getCodigo(), produto);
  }

  public void excluirProduto(Integer codigo) {
    this.produtoMap.remove(codigo);
  }

  public Set<Integer> retornarListaCodigo() {
    return this.produtoMap.keySet();
  }

  public List<Produto> retornarListaProdutos() {
    return new ArrayList<>(this.produtoMap.values());
  }

  public Integer tamanhoListaProdutos(){
    return this.produtoMap.size();
  }

  public boolean existeProduto(Integer codigo){
    return this.produtoMap.containsKey(codigo);
  }

}
