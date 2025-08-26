package generics.genericInterface02;

public class StringRepository implements Repository<String>{

    @Override
    public void add(String item) {
        System.out.println(item + "add metot çlıştı");
    }

    @Override
    public String get() {
        return "get metot çalıştı";
    }
}
