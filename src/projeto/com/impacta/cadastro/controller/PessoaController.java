package projeto.com.impacta.cadastro.controller;

import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.service.PessoaService;

public class PessoaController {

  public Pessoa cadastrar(Pessoa pessoa){
    PessoaService pessoaService = new PessoaService();
    return pessoaService.salvar(pessoa);
  }

}
