package gmail.nikmikhailov13.lesson38;

public class Box<E> {
    private E element;

    public void add(E e) {
        element = e;
    }

    public void remove() {
        element = null;
    }

    public E get() {
        return element;
    }

    public <S> S doSmth(S smth) {
        System.out.println(smth.toString());

        return smth;
    }
}
