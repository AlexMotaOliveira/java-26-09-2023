package cap18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

  public static void main(String[] args) {

    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    Connection connection = null;
    try {
      connection = DriverManager.getConnection(usuario, senha, urlConexao);

      // consulta
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
