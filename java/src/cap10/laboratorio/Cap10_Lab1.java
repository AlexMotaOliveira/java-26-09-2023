package cap10.laboratorio;

public class Cap10_Lab1 {


  public static void main(String[] args) {

    Imprimivel relatorio = new Relatorio();
    relatorio.imprimivel();
    relatorio.salvar("relatorio");
//    relatorio.assinar(); só esta disponivel no tipo Relatorio

    Relatorio relatorio1 = new Relatorio();
    relatorio1.imprimivel();
    relatorio1.salvar("relatorio");
    relatorio1.assinar("Alex");

    Imprimivel grafico = new Grafico();
    grafico.imprimivel();
    grafico.salvar("grafico");

    Grafico grafico1 = new Grafico();
    grafico1.salvar("grafico");

    Imprimivel.imprimirVarArgs(relatorio, relatorio1, grafico, grafico1);

    Imprimivel[] lista = {relatorio, relatorio1, grafico, grafico1};
    Imprimivel.imprimirArray(lista);


    Imprimivel imprimivel = new Imprimivel() { // interface ou classe abstrata
      @Override
      public void imprimivel() {
        System.out.println("implementação da interface em um objeto");
      }
    };

    imprimivel.imprimivel();

  }
}
