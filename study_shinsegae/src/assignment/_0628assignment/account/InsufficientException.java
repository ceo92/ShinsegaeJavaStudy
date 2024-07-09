package _0628assignment.account;

public class InsufficientException extends RuntimeException{

  public InsufficientException() {
    super();
  }

  public InsufficientException(String message) {
    super(message);
  }

  public InsufficientException(String message, Throwable cause) {
    super(message, cause);
  }

  public InsufficientException(Throwable cause) {
    super(cause);
  }

  protected InsufficientException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
