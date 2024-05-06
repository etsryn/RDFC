package bms.utilities.exception;

public class ConnectionFailed extends RuntimeException {
    public ConnectionFailed(String str) {
        super(str);
    }
}
