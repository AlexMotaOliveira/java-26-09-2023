package cap06;

public class Aluno {

  private String nome;
  private int idade;
  private int matricula;
  private String rg;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome.toUpperCase();
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public void imprimir(){
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("matricula: " + matricula);
  }
}
