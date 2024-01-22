package sky.core.org.app.exceptions;

public class InvalidNameException extends IllegalArgumentException {

    public InvalidNameException(String name) {
        super ("Invalid name:" + name);
    }
}
