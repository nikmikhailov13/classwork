package academy.codillas.classwork.lesson29.animals;

public class ZooIsFullException extends RuntimeException {
    public ZooIsFullException() {
        super("Zoo is full.");
    }
}
