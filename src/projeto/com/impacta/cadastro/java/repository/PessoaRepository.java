package projeto.com.impacta.cadastro.java.repository;

import projeto.com.impacta.cadastro.java.model.Pessoa;

import java.util.List;

public interface PessoaRepository {

  // Create Read Update Delete

  //create
  Pessoa save(Pessoa pessoa);

  // Read
  Pessoa findByIdPessoa(int idPessoa);
  Pessoa findByCpf(String cpf);
  List<Pessoa> findByNome(String nome);
  List<Pessoa> findByAll();

  //Update
  Pessoa update(Pessoa pessoa);

  // Delete
  int delete(int idPessoa);

}
