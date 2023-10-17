package cap14.laboratorio;

import cap14.Imprimir2;

public class DescontoSalarial {


  public static void main(String[] args) {


    double[] salariosBrutos =
      {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};

    double[] salariosLiquidos = DoubleArrayUtils
      .transformaValores(salariosBrutos, salario -> salario * 0.90);

//    for (double salarioLiquido : salariosLiquidos) {
//      System.out.println(salarioLiquido);
//    }

    DoubleArrayUtils.processaValores(salariosLiquidos, salario ->
      System.out.println(salario));
    DoubleArrayUtils.processaValores(salariosLiquidos, System.out::println);
    DoubleArrayUtils.processaValores(salariosLiquidos, Imprimir2::imprimir);

  }


}
