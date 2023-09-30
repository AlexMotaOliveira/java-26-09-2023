package cap05;

public class Pessoa {

  //atributo
  String nome;
  int idade;
  String pais;
  double altura;


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
