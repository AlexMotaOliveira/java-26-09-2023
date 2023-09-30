package cap05;

public class Teste {

  public static void main(String[] args) {

    int soma;
    Pessoa pessoa;

    Pessoa batata = new Pessoa(); // instancia da classe Pessoa = objeto

    batata.nome = "Alex"; // atribuição
    batata.idade = 21;
    batata.pais = "Brasil";
    batata.altura = 1.70;

    batata.falar();  // metodo
    batata.andar();

    Pessoa joao = new Pessoa();

    joao.nome = "Jao";
    joao.idade = 30;
    joao.pais = "Brasil";
    joao.altura = 1.80;

    Carro fiat = new Carro();

    fiat.carro = "Uno";
    fiat.motorista = joao;

    System.out.println("O nome do objeto joao é: " + joao.nome);

    joao.imprimir();

    joao = batata;

    joao.imprimir();

    fiat.motorista = batata;

    int  idade1 = 10;
    int idade2 = 15;
    // joao (Pessoa@761)
    // idade1 (15)

    idade1 = idade2;

    System.out.println();

  }
}
