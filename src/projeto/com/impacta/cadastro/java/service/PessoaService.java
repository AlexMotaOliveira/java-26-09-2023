package projeto.com.impacta.cadastro.java.service;

import projeto.com.impacta.cadastro.java.exception.PessoaException;
import projeto.com.impacta.cadastro.java.model.Pessoa;
import projeto.com.impacta.cadastro.java.repository.PessoaRepositoryImpl;

import java.util.List;

// regras de negocio
public class PessoaService {

  private final PessoaRepositoryImpl pessoaRepository;

  public PessoaService() {
    pessoaRepository = new PessoaRepositoryImpl();
  }

  public Pessoa salvar(Pessoa pessoa) {
    if (pessoa.getNome() != null && pessoa.getCpf() != null) {
      // TODO: 26/10/2023 validar se o cpf já esta cadastrado
      System.out.println("service Pessoa");

      return pessoaRepository.save(pessoa);
    }

    throw new PessoaException("não foi possivel salvar o objeto, " +
      "porque contem dados nulos: " + "Nome:" + pessoa.getNome() + " cpf " + pessoa.getCpf());
  }

  public Pessoa buscarPorIdPessoa(int idPessoa){
    return pessoaRepository.findByIdPessoa(idPessoa);
  }


  public Pessoa buscarPorCpf(String cpf) {
    return pessoaRepository.findByCpf(cpf);
  }

  public List<Pessoa> buscarTodos() {
    return pessoaRepository.findByAll();
  }
}
