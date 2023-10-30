package cap05;

public class Aluno {

  public String nome;
  public int idade;
  protected int matricula;


  private String getNome() {
    return nome;
  }

  protected void setNome(String nome) {
    nome = nome;
  }


  private class Aluno2{ }
}
