package cap09.laboratorio.exemplo.chat;

public abstract class Chat {

  private String nomeCliente;
  private String nomeOperador;

  public Chat(){

  }

  public Chat(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public abstract String enviarMessagem(String mensagem);

  public abstract String receberMessagem(String mensagem);

  public abstract String entrarNoChat();

  public abstract String sairNoChat();

  public String getNomeCliente() {
    return nomeCliente;
  }

  public String getNomeOperador() {
    return nomeOperador;
  }

  public void setNomeOperador(String nomeOperador) {
    this.nomeOperador = nomeOperador;
  }
}
