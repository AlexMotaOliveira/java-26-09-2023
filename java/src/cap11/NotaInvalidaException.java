package cap11;

public class NotaInvalidaException extends RuntimeException {

  public NotaInvalidaException() {
    super();
  }

  public NotaInvalidaException(String message) {
    super(message);
  }

  public NotaInvalidaException(String message, Throwable throwable) {
    super(message, throwable);
  }
}
