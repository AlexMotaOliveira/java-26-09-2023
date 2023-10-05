package cap07;

import java.util.Date;

public class Aluno {

  private String nome;
  private int idade;
  private int matricula;

  // padrão ou default
    public Aluno(){

    }

  public Aluno(String nome, int idade, int matricula) {
    this.nome = nome.toUpperCase();
    this.idade = idade;
    this.matricula = matricula;
  }

  public Aluno(String nome, int idade, int matricula, Date dataCadastro) {
    this.nome = nome.toUpperCase();
    this.idade = idade;
    this.matricula = matricula;
  }

  public Aluno(String nome) {
    this.nome = nome;
  }


  public Aluno(int matricula) {
    this.matricula = matricula;
  }

  public Aluno(String nome, int idade) {
    this.nome = nome.toUpperCase();
    this.idade = idade;
  }

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

  public void imprimir() {
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("matricula: " + matricula);
  }
}
