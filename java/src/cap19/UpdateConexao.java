package cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateConexao {

  public static void main(String[] args) {

    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    String query = "UPDATE impacta.pessoa " +
      "SET nome = ? " +
      "WHERE (idpessoa = ?);";

    // try-with-resources
    try (Connection connection = DriverManager.getConnection(urlConexao, usuario, senha);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

      preparedStatement.setString(1, "Jão Silva".toUpperCase());
      preparedStatement.setInt(2, 3);

      if (preparedStatement.executeUpdate() > 0) {
        System.out.println("atualizado com sucesso");
      } else {
        System.out.println("não foi atualizado");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
