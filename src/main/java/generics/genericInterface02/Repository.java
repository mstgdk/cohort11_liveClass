package generics.genericInterface02;

public interface Repository<T> {
    void add(T item);

    T get();

}
