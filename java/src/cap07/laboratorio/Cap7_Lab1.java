package cap07.laboratorio;

public class Cap7_Lab1 {

  public static void main(String[] args) {

    Cadastro cadastro1 = new Cadastro();
    cadastro1.setNome("Cadrasto");
    cadastro1.setSobreNome("1");
    cadastro1.setIdade(30);
    cadastro1.mostrar();

    Cadastro cadastro2 = new Cadastro("Alex", "Mota");
    cadastro2.setIdade(45);
    cadastro2.mostrar();

    Cadastro cadastro3 = new Cadastro("Maria", "Silva", 30);
    cadastro3.mostrar();

  }
}
