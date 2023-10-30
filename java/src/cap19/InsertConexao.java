package cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertConexao {

  public static void main(String[] args) {

    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    Connection connection = null;
    try {
      connection = DriverManager.getConnection(urlConexao, usuario, senha);
                                 // index dinamico 1 ,    2 ,   3
      String query = "INSERT INTO impacta.pessoa (nome, cpf, idpessoa) VALUES (?, ?, ?);";

      PreparedStatement ps = connection.prepareStatement(query);

      String nome = "Jose Silva";
      ps.setString(1, nome);

      int idpessoa = 6;
      ps.setInt(3, idpessoa);

      String cpf = "3698741259";
      ps.setString(2, cpf);

      if (ps.executeUpdate() > 0) {
        System.out.println("add com sucesso");
      } else {
        System.out.println("nome não foi add");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
