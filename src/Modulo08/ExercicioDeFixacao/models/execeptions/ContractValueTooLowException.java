package Modulo08.ExercicioDeFixacao.models.execeptions;

public class ContractValueTooLowException extends RuntimeException{
    
    public ContractValueTooLowException(String message){
        super(message);
    }
    
}
