package projeto.com.impacta.cadastro.repository;

import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PessoaRepositoryImpl implements PessoaRepository {

  @Override
  public Pessoa save(Pessoa pessoa) {

    String query = "INSERT INTO impacta.pessoa (nome, cpf) VALUES (? ,?);";

    try (Connection connection = getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

      preparedStatement.setString(1, pessoa.getNome());
      preparedStatement.setString(2, pessoa.getCpf());

      if (preparedStatement.executeUpdate() > 0) {
        System.out.println("salvo com sucesso...");
        return pessoa;
      }
      throw new PessoaException("Não foi possivel salvar objeto: " + pessoa);
    } catch (SQLException | PessoaException e) {
        e.printStackTrace();
    }

    return null;
  }

  @Override
  public Pessoa findByIdPessoa(int idPessoa) {
    return null;
  }

  @Override
  public Pessoa findByCpf(String cpf) {
    return null;
  }

  @Override
  public List<Pessoa> findByNome(String nome) {
    return null;
  }

  @Override
  public List<Pessoa> findByAll() {
    return null;
  }

  @Override
  public Pessoa update(Pessoa pessoa) {
    return null;
  }

  @Override
  public int delete(int idPessoa) {
    return 0;
  }

  // TODO: 25/10/2023 extrair para uma classe abstrata essa conexao 
  private Connection getConnection() throws SQLException {
    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    return DriverManager.getConnection(urlConexao, usuario, senha);
  }
}
