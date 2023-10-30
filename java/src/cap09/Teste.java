package cap09;

public class Teste {

  public static void main(String[] args) {

    // TODO: 06/10/2023  salvar a imagem do diagrama no git

    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Alex");
    pessoa.setIdade(50);
    pessoa.setCpf("12345678963");


    Funcionario funcionario = new Funcionario();
    funcionario.setMatricula("SA65874");
    funcionario.setNome("Joao Silva");
    funcionario.setIdade(30);
    funcionario.setCpf("65874598632");
    funcionario.setNacionalidade("Brasileiro");
    funcionario.setNaturalidade("São Paulo");

    Cliente cliente = new Cliente();
    cliente.setId("CL25445");
    cliente.setNome("Maria Silva");
    cliente.setIdade(23);
    cliente.setCpf("65875632589");
    cliente.setNacionalidade("Brasileiro");
    cliente.setNaturalidade("São Paulo");

    Programador programador = new Programador();
    programador.setLinguagem("Java"); // é da classe Programador
    programador.setMatricula("SA24587"); // é da classe Funcionario
    programador.setNome("Daiane");      // é da classe Pessoa
    programador.setIdade(28); // é da classe Pessoa
    programador.setCpf("12375632589"); // é da classe Pessoa
    programador.setNacionalidade("Brasileiro"); // é da classe Pessoa
    programador.setNaturalidade("Rio de Janeiro"); // é da classe Pessoa

     Pessoa funcionario1 = new Funcionario();
     Pessoa cliente1 = new Cliente();

     Funcionario programador2 = new Programador();
     Pessoa programador1 = new Programador();

  }
}
