package cap09;

// Funcionario é uma Pessoa
// Funcionario subClasse filho/filha      Pessoa SuperClasse Pai/Mae
public class Funcionario extends Pessoa {

  private String matricula;
  private double salario;

//  public Funcionario(String matricula, double salario, Pessoa pessoa) {
//    super(pessoa.getNome(), pessoa.getIdade(), pessoa.getCpf(),
//      pessoa.getNacionalidade(), pessoa.getNaturalidade(),
//      pessoa.getTipo());
//    this.matricula = matricula;
//    this.salario = salario;
//  }

  public Funcionario() {

  }


  public Funcionario(String matricula, double salario, Pessoa pessoa) {
    super(pessoa);
    this.matricula = matricula;
    this.salario = salario;
  }


  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void imprimir() {
    System.out.println("Nome: " + super.nome);
    System.out.println("Idade: " + super.getIdade());
    System.out.println("Cpf: " + super.getCpf());
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Salario: " + this.salario);
  }


  @Override // polimorfismo
  public void setNome(String nome) {
    super.nome = nome.toUpperCase();
  }

  @Override // sobrecarga de Object
  public String toString() {
    return "Funcionario{" +
      "matricula='" + matricula + '\'' +
      ", salario=" + salario +
      super.toString() +
      '}';
  }
}
