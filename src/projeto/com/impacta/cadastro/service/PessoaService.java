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

      System.out.println("service Pessoa");

      pessoaRepository.save(pessoa);
      return pessoa;
    }

    throw new PessoaException("não foi possivel salvar o objeto, " +
      "porque contem dados nulos: " + "Nome:" + pessoa.getNome() + " cpf " + pessoa.getCpf());
  }

}
