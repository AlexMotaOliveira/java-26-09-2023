package cap11;

public class NumeroInvalidoException extends Exception{

 public NumeroInvalidoException(String message){
   super(message);
 }

 public NumeroInvalidoException(String message, Throwable throwable){
   super(message, throwable);
 }
}
