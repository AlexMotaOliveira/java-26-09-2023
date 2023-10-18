package cap15;

import cap07.Aluno;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerico {

  public static void main(String[] args) {


    String texto = "Ola";

    Generico2<Object> generico = new Generico2();
    generico.setValue(10);
    generico.setValue("Texto");
    generico.setValue(new Aluno());
    generico.setTexto("10");
    generico.setTexto("new Aluno()");


    Generico2<?> generico1 = new Generico2();
//    generico1.setValue(10);
//    generico1.setValue("Texto");
//    generico1.setValue(new Aluno());
    generico1.setTexto("10");
    generico1.setTexto("new Aluno()");


    Generico2<String> generico2 = new Generico2();
    generico2.setValue("Alo");
    generico2.setValue("10");

    List<String> list = new ArrayList();
//    list.add();
//    list.size();
//    list.get();

    List<Long> list1 = new ArrayList();
    List<Integer> list2 = new ArrayList();
    List<Aluno> list3 = new ArrayList();

    Long[] listArray = new Long[10];
    listArray[0] = 10L;


  }
}
