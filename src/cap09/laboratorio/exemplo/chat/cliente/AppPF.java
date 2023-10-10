package cap09.laboratorio.exemplo.chat.cliente;

import cap09.laboratorio.exemplo.chat.Chat;

public class AppPF extends Chat {

  public String login;

  public AppPF(String nome, String login){
    super(nome);
    this.login = login;
  }

  @Override
  public String enviarMessagem(String mensagem) {
    System.out.println("***** log enviando msg para o app");
    System.out.println(mensagem);
    return mensagem;
  }

  @Override
  public String receberMessagem(String mensagem) {
    System.out.println("***** log recebeno msg para o app");
    System.out.println(mensagem);

    return mensagem;
  }

  @Override
  public String entrarNoChat() {
    System.out.println("***** log enviando msg para o app");
    return super.getNomeCliente() + ": online";
  }

  @Override
  public String sairNoChat() {
    System.out.println("***** log enviando msg para o app");
    return super.getNomeCliente() + ": offline";
  }


}
