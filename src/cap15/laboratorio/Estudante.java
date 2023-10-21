package cap15.laboratorio;

import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class Estudante {

  private String cpf;
  private String rne;
  private String nome;
  private Double notaMatematica;
  private Double notaPortugues;
  private Double media;

  public Estudante() {

  }

  public Estudante(String nome, Double notaMatematica, Double notaPortugues) {
    this.nome = nome;
    this.notaMatematica = notaMatematica;
    this.notaPortugues = notaPortugues;
  }

  public Estudante(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
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

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    } else if (object == null || this.getClass() != object.getClass()) {
      return false;
    } else {
      Estudante estudante = (Estudante) object; // Object convetido para Estudante
      return this.hashCode() == estudante.hashCode();
//    return this.hashCode() == ((Estudante)object).hashCode();
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, rne); // gerar um identificação unica do objeto
  }
}
