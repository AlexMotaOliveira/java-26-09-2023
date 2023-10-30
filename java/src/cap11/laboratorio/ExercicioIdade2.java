package cap11.laboratorio;

import javax.swing.*;

public class ExercicioIdade2 {

  public static void main(String[] args) {

    int ano = 0;
    do {
      System.out.print("Digite o ano do seu nascimento: ");
      String texto = JOptionPane.showInputDialog("Digite o ano"); // pego um valor digitado
      try {
        ano = Integer.parseInt(texto);
        int idade = 2023 - ano;
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos");
      } catch (NumberFormatException e) {
        e.printStackTrace();
        System.out.println();
        JOptionPane.showMessageDialog(null, "Valor invalido");
      }
    } while (ano == 0);
  }
}

