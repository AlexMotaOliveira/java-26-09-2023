package cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteConexao {

  public static void main(String[] args) {

    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    Connection connection = null;
    try {
      connection = DriverManager.getConnection(urlConexao, usuario, senha);

      String query = "DELETE FROM impacta.pessoa WHERE idpessoa = ?;";

      PreparedStatement preparedStatement = connection.prepareStatement(query);

      preparedStatement.setInt(1, 3);

      if (preparedStatement.executeUpdate() > 0) {
        System.out.println("cpf cancelado com sucesso");
      } else {
        System.out.println("não foi possivel excluir args linha: " + 3);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (connection != null) {
        try {
          connection.close();
          System.out.println("conexao fechada com sucesso");
        } catch (SQLException e) {
          System.out.println("falha ao fechar ao conexao");
          e.printStackTrace();
        }
      }
    }
  }
}
