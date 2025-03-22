package joaopaulofelipe.myapi.services.exceptions;

public class ObjctNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjctNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjctNotFoundException(String cause) {
        super(cause);
    }
}
