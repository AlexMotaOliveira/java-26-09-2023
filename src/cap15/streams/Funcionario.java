package cap15.streams;

public class Funcionario implements Comparable {

  private int matricula;
  private String nome;
  private String cargo;
  private Double salario;

  public Funcionario(int matricula, String nome, String cargo, Double salario) {
    this.matricula = matricula;
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
      "matricula=" + matricula +
      ", nome='" + nome + '\'' +
      ", cargo='" + cargo + '\'' +
      ", salario=" + salario +
      '}';
  }

  @Override
  public int compareTo(Object salario) {
    Funcionario funcionario = (Funcionario) salario;
    if (this.salario < funcionario.getSalario()) {
      return -1;
    } else if (this.salario == funcionario.getSalario()) {
      return 0;
    } else {
      return 1;
    }
  }
}
