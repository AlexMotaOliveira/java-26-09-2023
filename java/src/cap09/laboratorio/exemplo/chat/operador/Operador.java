package cap09.laboratorio.exemplo.chat.operador;

import cap09.laboratorio.exemplo.chat.Chat;

public class Operador extends Chat {

  private String login;

  public Operador(String nome, String login) {
    super.setNomeOperador(nome);
    this.login = login;
  }

  @Override
  public String enviarMessagem(String mensagem) {
    System.out.println("***** log enviando msg para o cliente");
    System.out.println(mensagem);
    return mensagem;
  }

  @Override
  public String receberMessagem(String mensagem) {
    System.out.println("***** log recebeno msg para o cliente");
    System.out.println(mensagem);

    return mensagem;
  }

  @Override
  public String entrarNoChat() {
    System.out.println("***** log enviando msg para o cliente");
    return super.getNomeOperador() + ": online";
  }

  @Override
  public String sairNoChat() {
    System.out.println("***** log enviando msg para o cliente");
    return super.getNomeOperador() + ": offline";
  }

}
