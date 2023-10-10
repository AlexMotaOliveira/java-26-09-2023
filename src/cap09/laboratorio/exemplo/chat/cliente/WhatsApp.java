package cap09.laboratorio.exemplo.chat.cliente;

import cap09.laboratorio.exemplo.chat.Chat;

public class WhatsApp extends Chat {

  private String telefone;

  public WhatsApp(String nome, String telefone) {
    super(nome);
    this.telefone = telefone;
  }

  @Override
  public String enviarMessagem(String mensagem) {
    System.out.println("**** log recebendo msg da api whatsapp");
    return mensagem;
  }

  @Override
  public String receberMessagem(String mensagem) {
    System.out.println("**** log enviando msg da api whatsapp");
    return mensagem;
  }

  @Override
  public String entrarNoChat() {
    System.out.println("**** log enviando status para a api whatsapp");
    return super.getNomeCliente() + ": online";
  }

  @Override
  public String sairNoChat() {
    System.out.println("**** log enviando status para a api whatsapp");
    return super.getNomeCliente() + ":offline";
  }


}
