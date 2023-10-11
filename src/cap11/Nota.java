package cap11;

public class Nota {

  private String aluno;
  private int nota;

  public Nota(String aluno, int nota) throws NotaInvalidaException {
    this.aluno = aluno;
    this.setNota(nota);
  }

  public String getAluno() {
    return aluno;
  }

  public void setAluno(String aluno) {
    this.aluno = aluno;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) throws NotaInvalidaException {
    if (nota >= 0 && nota <= 10) { // 0 entre 10
      this.nota = nota;
    } else {
      throw new NotaInvalidaException("Nota fora do padrão");
    }
  }

  @Override
  public String toString() {
    return "Nota{" +
      "aluno='" + aluno + '\'' +
      ", nota=" + nota +
      '}';
  }
}
