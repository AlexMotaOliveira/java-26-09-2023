package cap15.laboratorio;

public class Estudante {

  private String nome;
  private Double notaMatematica;
  private Double notaPortugues;
  private Double media;

  public Estudante(String nome, Double notaMatematica, Double notaPortugues) {
    this.nome = nome;
    this.notaMatematica = notaMatematica;
    this.notaPortugues = notaPortugues;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getNotaMatematica() {
    return notaMatematica;
  }

  public void setNotaMatematica(Double notaMatematica) {
    this.notaMatematica = notaMatematica;
  }

  public Double getNotaPortugues() {
    return notaPortugues;
  }

  public void setNotaPortugues(Double notaPortugues) {
    this.notaPortugues = notaPortugues;
  }

  public Double getMedia() {
    return media;
  }

  public void setMedia(Double media) {
    this.media = media;
  }
}
