package generics.genericClass01;

public class Book<T> {
    //class-interface-metot
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Book{" +
                "value=" + value +
                '}';
    }
}
