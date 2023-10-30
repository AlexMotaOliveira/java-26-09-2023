package projeto.com.impacta.cadastro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import projeto.com.impacta.cadastro.controller.PessoaController;
import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

import java.util.List;

public class PessoaControllerTeste {

  private static PessoaController pessoaController;

  @BeforeAll
  static void start() {
    pessoaController = new PessoaController();
  }

  @Test
    // teste positivo
  void cadastrarPessoaTesteOK() {

    Pessoa pessoa = new Pessoa("Alex Mota Brito", "22945978936");
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
  void buscarPessoaPeloIdPessoaTesteOk() {

    int idPessoa = 11;

    Pessoa pessoaEntity = pessoaController.buscarPorIdPessoa(idPessoa);

    Assertions.assertNotNull(pessoaEntity);
    Assertions.assertTrue(idPessoa == pessoaEntity.getIdPessoa());
    Assertions.assertEquals(idPessoa, pessoaEntity.getIdPessoa());
  }

  @Test
  void buscarPessoaPeloIdPessoaTesteNok() {

    int idPessoa = 1000;

    Pessoa pessoaEntity = pessoaController.buscarPorIdPessoa(idPessoa);

    Assertions.assertNull(pessoaEntity);
  }

  @Test
  void buscarPessoaPeloCpfTesteOk() {

    String cpf = "22345978936";

    Pessoa pessoaEntity = pessoaController.buscarPorCpf(cpf);

    Assertions.assertNotNull(pessoaEntity);
    Assertions.assertTrue(cpf.equals(pessoaEntity.getCpf()));
    Assertions.assertEquals(cpf, pessoaEntity.getCpf());

    System.out.println(pessoaEntity);
  }

  @Test
  void buscarPessoaPeloCpfTesteNok() {

    String cpf = "100000000";

    Pessoa pessoaEntity = pessoaController.buscarPorCpf(cpf);

    Assertions.assertNull(pessoaEntity);

    System.out.println("não exsite um pessoa com esse cpf");
  }

  @Test
  void buscarListaDePessoaOk() {

    List<Pessoa> pessoas = pessoaController.buscarTodos();

    Assertions.assertFalse(pessoas.isEmpty());

    pessoas.forEach(System.out::println);
  }

  @Test
  void excluirIdPessoa() {
    try {
      int idPessoa = 11;
      pessoaController.excluir(idPessoa);
      Pessoa pessoa = pessoaController.buscarPorIdPessoa(idPessoa);
      Assertions.assertNull(pessoa);
    } catch (RuntimeException e) {
      e.printStackTrace();
      Assertions.assertTrue(e instanceof PessoaException);
    }
  }

  @Test
  void atualizarNomeOk() {

    Pessoa pessoa = new Pessoa(1, "Maria das Graças", "12345678912");

    Pessoa pessoaEntity = pessoaController.atualizar(pessoa);

    Assertions.assertNotNull(pessoaEntity);
    Assertions.assertEquals(pessoa.getNome(), pessoaEntity.getNome());

  }

  @Test
  void atualizarCpfExistenteIdDiferenteNok() {

    Pessoa pessoa = new Pessoa(1, "Maria das Graças", "12345978932");

    Pessoa pessoaEntity = pessoaController.atualizar(pessoa);
    Assertions.assertNotNull(pessoaEntity);
    Assertions.assertNotEquals(pessoa.getCpf(), pessoaEntity.getCpf());

  }
}
