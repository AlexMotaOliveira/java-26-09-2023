package cap04.laboratorio;

public class Laboratorio1 {

  public static void main(String[] args) {

    int numero = 337;

    if(numero == 0 || numero == 1){
      System.out.println(numero + " não é numero primo");
    }

    int divisor = 1;
    int contador = 0;

    while (divisor <= numero ){
      if(numero % divisor == 0){
        contador++;
      }
      divisor++;
    }

    if(contador == 2){
      System.out.println(numero + " é numero primo");
    }else {
      System.out.println(numero + " não é numero primo");
    }

  }
}
