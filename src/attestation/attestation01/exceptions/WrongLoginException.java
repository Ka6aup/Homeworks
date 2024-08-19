package attestation.attestation01.exceptions;

public class WrongLoginException extends IllegalArgumentException {
    static final String MESSAGE = "Логин имеет неверный формат!";
    public WrongLoginException() {
        super(MESSAGE);
    }

}
