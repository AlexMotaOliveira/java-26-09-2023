package projeto.com.impacta.cadastro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import projeto.com.impacta.cadastro.controller.PessoaController;
import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

public class PessoaControllerTeste {

  private static PessoaController pessoaController;

  @BeforeAll
  static void start() {
    pessoaController = new PessoaController();
  }

  @Test
    // teste positivo
  void cadastrarPessoaTeste() {

    Pessoa pessoa = new Pessoa("Alex Mota", "12345678932");
    System.out.println("Test: criou o objeto pessoa:" + pessoa);

    Pessoa pessoaEntity = pessoaController.cadastrar(pessoa);
    System.out.println("Test: executou o metodo salvar");

    Assertions.assertNotNull(pessoaEntity);
  }

  @Test
    // teste negativo
  void cadastrarPessoaNomeOuCpfNuloTeste() {

    Pessoa pessoa = new Pessoa("Roberto", null);

    Assertions.assertThrows(PessoaException.class,
      () -> pessoaController.cadastrar(pessoa));

  }
}
