package cap18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectConexao {

  public static void main(String[] args) {

    String usuario = "root";
    String senha = "123456";
    String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

    Connection connection = null;
    try {
      connection = DriverManager.getConnection(urlConexao, usuario, senha);

      Statement statement = connection.createStatement();

      String query = "SELECT * FROM pessoa";

      ResultSet resultSet = statement.executeQuery(query);

      while (resultSet.next()){
        int idpessoa = resultSet.getInt("idpessoa");
        String nome = resultSet.getString("nome");
        String cpf = resultSet.getString("cpf");

        System.out.println("idpessoa: " + idpessoa + " nome: " + nome + " cpf: " + cpf);

      }

      System.out.println();

      // consulta
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
