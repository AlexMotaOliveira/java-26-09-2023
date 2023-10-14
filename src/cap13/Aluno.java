package cap13;

import cap09.laboratorio.Pessoa;
import cap09.laboratorio.Rg;

public class Aluno extends Pessoa {

  private String curso;
  private float mensalidade;

  public Aluno(String curso, float mensalidade,
               String nome, int idade, char sexo, int numeroRg, String dataNasc) {
    super(nome, idade, sexo, new Rg(numeroRg, dataNasc)); // contrutor da superClasse
    this.curso = curso;
    this.mensalidade = mensalidade;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public float getMensalidade() {
    return mensalidade;
  }

  public void setMensalidade(float mensalidade) {
    this.mensalidade = mensalidade;
  }

  @Override
  public String toString() {
    return "Aluno{" +
      "curso='" + curso + '\'' +
      ", mensalidade=" + mensalidade +
      '}';
  }

  @Override
  public void falar(String fala) {
    System.out.println(super.getNome() + ": " + fala);
  }

  @Override
  public void mostrarDados() {
    System.out.println(super.toString());
    System.out.println(toString());
    System.out.println();
  }
}
