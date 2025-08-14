package oop.interfacee;

public interface Engine {
    //concrete metot yazılmaz
    //fully abstraction
    // fieldlar otomatik olarak -> public,final,stqatic

    String name = "mesut";
    void gas();

    public abstract void run();
}
