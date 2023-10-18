package cap15;

// classe generica
public class Generico<K, V> {

  private K value; // desde primitivos até classes
  private V key;


  public K getValue() {
    return value;
  }

  public void setValue(K value) {
    this.value = value;
  }

  public V getKey() {
    return key;
  }

  public void setKey(V key) {
    this.key = key;
  }
}
