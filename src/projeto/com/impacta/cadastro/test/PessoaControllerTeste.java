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
  void cadastrarPessoaTesteOK() {

    Pessoa pessoa = new Pessoa("Jose Silva Santos", "22345978936");
    System.out.println("Test: criou o objeto pessoa:" + pessoa);

    Pessoa pessoaEntity = pessoaController.cadastrar(pessoa);
    System.out.println("Test: executou o metodo salvar: " + pessoaEntity);

    Assertions.assertNotNull(pessoaEntity);
  }

  @Test
    // teste negativo
  void cadastrarPessoaNomeOuCpfNuloTesteNok() {

    Pessoa pessoa = new Pessoa("Roberto", null);

    Assertions.assertThrows(PessoaException.class,
      () -> pessoaController.cadastrar(pessoa));

  }

  @Test
  void buscarPessoaPeloIdPessoaTesteOk(){

    int idPessoa = 11;

    Pessoa pessoaEntity = pessoaController.buscarPorIdPessoa(idPessoa);

    Assertions.assertNotNull(pessoaEntity);
    Assertions.assertTrue(idPessoa ==  pessoaEntity.getIdPessoa());
    Assertions.assertEquals(idPessoa, pessoaEntity.getIdPessoa());
  }

  @Test
  void buscarPessoaPeloIdPessoaTesteNok(){

    int idPessoa = 1000;

    Pessoa pessoaEntity = pessoaController.buscarPorIdPessoa(idPessoa);

    Assertions.assertNull(pessoaEntity);
  }

}
