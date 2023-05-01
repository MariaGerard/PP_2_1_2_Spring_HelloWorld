import java.io.Serializable;

public class Cat implements Serializable {

    private static String message;

    public Cat() {
    }

    public Cat(String message) {
        this.message = message;
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        Cat.message = message;
    }
}
