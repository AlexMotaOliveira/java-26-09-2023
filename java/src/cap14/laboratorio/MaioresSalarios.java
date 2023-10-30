package cap14.laboratorio;

import cap14.Imprimir2;

import java.util.logging.SocketHandler;

public class MaioresSalarios {


  public static void main(String[] args) {


    double[] salariosBrutos =
      {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};

    double[] salariosTop = DoubleArrayUtils
      .filtraValores(salariosBrutos, salario -> salario >= 3000 );

//    for (double salarioLiquido : salariosTop) {
//      System.out.println(salarioLiquido);
//    }

    DoubleArrayUtils.processaValores(salariosTop, salario -> System.out.println(salario));
    DoubleArrayUtils.processaValores(salariosTop, System.out::println);
    DoubleArrayUtils.processaValores(salariosTop, Imprimir2::imprimir);

  }


}
