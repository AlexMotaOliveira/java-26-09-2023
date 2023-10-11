package cap11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTeste {

  public static void main(String[] args) {


    try {
//      FileInputStream inputStream = null; // NPE NullPointerException @7856
//      inputStream.close();

      long numero = Long.parseLong("DEZ");

      abrirArquivo();
    } catch (IOException e) {
      System.out.println(e);
      throw new RuntimeException("informe um diretorio valido");
    }catch (NullPointerException | NumberFormatException e){
      System.out.println(e);
    } finally {
      // conecta com o banco, é necessario fechar a conexão
      System.out.println("meu programa falhou");
    }
  }

  public static void abrirArquivo() throws IOException, RuntimeException {
    File file = new File("c:\\teste\\arquivo.txt");
    FileInputStream inputStream = new FileInputStream(file);

  }

}
