package Modulo08.ExercicioDeFixacao.models.execeptions;

public class InstallmentTooLowException extends RuntimeException {

    public InstallmentTooLowException(String message) {
        super(message);
    }
}
