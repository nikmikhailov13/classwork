package gmail.nikmikhailov13.lesson29.animals;

public class ZooIsFullException extends RuntimeException {
    public ZooIsFullException() {
        super("Zoo is full.");
    }
}
