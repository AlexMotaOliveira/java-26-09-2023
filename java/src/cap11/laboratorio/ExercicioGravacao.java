package cap11.laboratorio;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ExercicioGravacao {

  public static void main(String[] args) {

    String texto = JOptionPane.showInputDialog("digite um texto qualquer");
    PrintWriter writer = null;
    try {
      writer = new PrintWriter("doc.txt");
//      writer.println(texto); // sobrescreve todo o texto do arquivo
      writer.append(texto); // add o novo texto digitado
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (writer != null) {
        writer.close();
      }
    }
  }
}
