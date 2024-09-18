package Modulo08.ExercicioDeFixacao.models.execeptions;

public class ContractNumberTooLowException extends RuntimeException {
  public ContractNumberTooLowException(String message) {
    super(message);
  }
}
