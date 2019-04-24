package by.bntu.fitr.povt.beltring.javalabs.lab10.exception;

public class DataException extends Exception{

    public DataException() {
        super();
    }

    public DataException(String message) {
        super(message);
    }

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataException(Throwable cause) {
        super(cause);
    }
    
}
