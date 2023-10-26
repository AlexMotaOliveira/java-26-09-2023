package projeto.com.impacta.cadastro.service;

import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

public class PessoaService {

  public Pessoa salvar(Pessoa pessoa) {
    if (pessoa.getNome() != null && pessoa.getCpf() != null) {
      // TODO: 25/10/2023 salvar no banco de dados
      System.out.println("pessoa cadastrada com sucesso");

      return pessoa;
    }

    throw new PessoaException("não foi possivel salvar o objeto, " +
      "porque contem dados nulos: " + "Nome:"  + pessoa.getNome() + " cpf " + pessoa.getCpf());
  }

}
