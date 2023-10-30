package cap10.laboratorio;

public class Relatorio implements Imprimivel {

  private String nomeDaInterface = "relatorio";

  @Override
  public void imprimivel() { // corpo do metodo ou a definção do contrato
    System.out.println("Relatorio sendo impresso");
  }

  public void assinar(String nome){
    System.out.println("Assinando o relatorio: " + nome);
  }


}
