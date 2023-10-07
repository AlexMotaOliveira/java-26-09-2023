package cap09.laboratorio;

public class Professor extends Pessoa {

  private float salario;
  private String disciplina;

  public Professor(float salario, String disciplina,
                   String nome, int idade, char sexo,
                   int numeroRg, String dataNasc) {
    super(nome, idade, sexo, numeroRg, dataNasc);
    this.salario = salario;
    this.disciplina = disciplina;
  }

  public Professor(float salario, String disciplina,
                   String nome, int idade, char sexo,
                   Rg rg) {
    super(nome, idade, sexo, rg);
    this.salario = salario;
    this.disciplina = disciplina;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  @Override
  public void falar(String fala) {
    System.out.println(super.getNome() + ": " + fala);
  }

  @Override
  public void mostrarDados() {
    System.out.println(super.toString());
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Professor{" +
      "salario=" + salario +
      ", disciplina='" + disciplina + '\'' +
      '}';
  }
}
