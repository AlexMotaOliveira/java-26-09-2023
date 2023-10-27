package projeto.com.impacta.cadastro.service;

import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.repository.PessoaRepositoryImpl;

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
}
