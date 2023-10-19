package cap15.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsTeste {

  public static void main(String[] args) {

    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(new Funcionario(2658, "Alex Mota", "Instrutor", 1500.00));
    funcionarios.add(new Funcionario(2654, "Maria Augusta", "Desenvolvedor(a)", 6500.00));
    funcionarios.add(new Funcionario(6465, "João Silva", "Scrum Master", 10500.00));
    funcionarios.add(new Funcionario(6576, "Fernando lima", "Product Owner", 15000.00));
    funcionarios.add(new Funcionario(4687, "Jão Gilberto", "Desenvolvedor(a)", 2500.00));
    funcionarios.add(new Funcionario(8678, "Natal Silva", "Desenvolvedor(a)", 4500.00));

    List<Funcionario> funcionariosSalarioMaior = new ArrayList<>();
    for (Funcionario funcionario: funcionarios) {
      if (funcionario.getSalario() >= 1000){
        funcionariosSalarioMaior.add(funcionario);
      }
    }

    List<Funcionario> funcionariosCargoDesenvolvedor_A = new ArrayList<>();
    for (Funcionario funcionario: funcionariosSalarioMaior) {
      if (funcionario.getCargo() == "Desenvolvedor(a)"){
        funcionariosCargoDesenvolvedor_A.add(funcionario);
      }
    }
    funcionariosCargoDesenvolvedor_A.forEach(System.out::println);

    System.out.println("*****************************************");
    funcionarios
      .stream() // copia para streams
      .filter(funcionario -> funcionario.getSalario() >= 1000) // nova lista somente com quem granha acima de 5000
//      .filter(funcionario -> funcionario.getCargo() == "Desenvolvedor(a)") // nova lista somente com cargo desenvolvedor
      .limit(10) // limitou o max do retorno em 10
      .skip(1) // pulou o 1º resultado
//      .map(Funcionario::getNome)
      .map(funcionario -> funcionario.getCargo()) // dado um objeto de entrada ele retorna outro de saida
      .distinct()
      .forEach(System.out::println);


    long total = funcionarios
      .stream() // copia para streams
      .filter(funcionario -> funcionario.getSalario() >= 1000) // nova lista somente com quem granha acima de 5000
//      .filter(funcionario -> funcionario.getCargo() == "Desenvolvedor(a)") // nova lista somente com cargo desenvolvedor
      .limit(10) // limitou o max do retorno em 10
      .skip(1) // pulou o 1º resultado
//      .map(Funcionario::getNome)
      .map(funcionario -> funcionario.getCargo()) // dado um objeto de entrada ele retorna outro de saida
      .distinct()
      .count();
//      .forEach(System.out::println);

    System.out.println(total);

    System.out.println("********************");
    System.out.println(funcionarios
      .stream() // copia para streams
      .filter(funcionario -> funcionario.getSalario() >= 1000) // nova lista somente com quem granha acima de 5000
//      .sorted()
      .sorted((o1, o2) -> o1.getNome().compareTo(o2.getNome()))
      .min(Comparator.comparingDouble(Funcionario::getSalario))
//      .max(Comparator.comparingDouble(Funcionario::getSalario))
      .orElse(null));
//      .forEach(System.out::println);

  }
}
