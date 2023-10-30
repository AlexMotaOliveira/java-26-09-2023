package cap09.laboratorio.exemplo.chat;

import cap09.laboratorio.exemplo.chat.cliente.WhatsApp;
import cap09.laboratorio.exemplo.chat.operador.Operador;

public class InicarChat {

  public static void main(String[] args) {

    Chat whatsApp = new WhatsApp("Maria", "1198562547");

    Chat operador = new Operador("Jose", "SA12548");

    System.out.println(whatsApp.entrarNoChat());
    String msgCliente = whatsApp.enviarMessagem("quero saber o valor da minha fatura");


    System.out.println(operador.entrarNoChat());
    System.out.println(operador.receberMessagem(msgCliente));

    String msgOperador = operador.enviarMessagem("Sua fatura é de R$600");
    System.out.println(whatsApp.receberMessagem(msgOperador));

    System.out.println(operador.sairNoChat());
    System.out.println(whatsApp.sairNoChat());


  }
}
