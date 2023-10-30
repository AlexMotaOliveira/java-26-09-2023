package cap09;

// final não deixa que a classe seja extendida/herdada
// implicito extends Object
public class Pessoa {

  protected String nome; // as subClasse tem acesso ao atributo
  protected int idade;
  //private não tem acesso nas subClasses Filho/Filha
  private String cpf;
  private String nacionalidade;
  private String naturalidade;
  private Tipo tipo;

  public Pessoa(){

  }

  public Pessoa(String nome, int idade,
                String cpf, String nacionalidade,
                String naturalidade, Tipo tipo) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.nacionalidade = nacionalidade;
    this.naturalidade = naturalidade;
    this.tipo = tipo;
  }

  public Pessoa(Pessoa pessoa) {
    this.nome = pessoa.getNome();
    this.idade = pessoa.getIdade();
    this.cpf = pessoa.getCpf();
    this.nacionalidade = pessoa.getNacionalidade();
    this.naturalidade = pessoa.getNaturalidade();
    this.tipo = pessoa.getTipo();
  }

  public String getCpf() {
    return cpf;
  }

  protected void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public Tipo getTipo() {
    return tipo;
  }

  protected void setTipo(Tipo tipo) {
    this.tipo = tipo;
  }


  @Override
  public String toString() {
    return "Pessoa{" +
      "nome='" + nome + '\'' +
      ", idade=" + idade +
      ", cpf='" + cpf + '\'' +
      ", nacionalidade='" + nacionalidade + '\'' +
      ", naturalidade='" + naturalidade + '\'' +
      ", tipo=" + tipo +
      '}';
  }
}
