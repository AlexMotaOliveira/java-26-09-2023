package cap05;

public class Pessoa {

  //atributo
  String nome; // valor default null
  int idade;   // valor default 0
  String pais; // valor default null
  double altura; // valor default 0.0
  boolean estadoCivil; // valor default false















  void falar(){
    System.out.println("estou falando algo...");
  }

  void andar(){
    System.out.println("estou andando...");
  }

  void imprimir(){
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("pais: " + pais);
    System.out.println("altura: " + altura);
  }

}
