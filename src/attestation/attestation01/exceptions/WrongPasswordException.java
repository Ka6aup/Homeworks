package attestation.attestation01.exceptions;

public class WrongPasswordException extends IllegalArgumentException {
    static final String MESSAGE = "Пароль имеет неверный формат!";
    public WrongPasswordException() {
        super(MESSAGE);
    }
}
