package projeto.com.impacta.cadastro.java.controller;

import projeto.com.impacta.cadastro.java.model.Pessoa;
import projeto.com.impacta.cadastro.java.service.PessoaService;

import java.util.List;

public class PessoaController {

  // injeção de dependencia
  private PessoaService pessoaService;

  // injeção de dependencia
  public PessoaController(){
    pessoaService = new PessoaService();
  }

  public Pessoa cadastrar(Pessoa pessoa){
    return pessoaService.salvar(pessoa);
  }

  public Pessoa buscarPorIdPessoa(int idPessoa){
    return pessoaService.buscarPorIdPessoa(idPessoa);
  }

  public Pessoa buscarPorCpf(String cpf){
    return pessoaService.buscarPorCpf(cpf);
  }

  public List<Pessoa> buscarTodos(){
    return pessoaService.buscarTodos();
  }

}
