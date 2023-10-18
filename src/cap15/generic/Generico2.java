package cap15.generic;

// classe generica
public class Generico2<T> {

  private T value; // desde primitivos até classes
  private String texto;


  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }
}
